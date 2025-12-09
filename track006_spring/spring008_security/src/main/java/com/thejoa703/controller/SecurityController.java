package com.thejoa703.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thejoa703.dto.AppUserAuthDto;
import com.thejoa703.dto.AppUserDto;
import com.thejoa703.dto.AuthDto;
import com.thejoa703.dto.Sboard1Dto;
import com.thejoa703.security.CustomUser;
import com.thejoa703.service.AppUserService;

@Controller
@RequestMapping("/security/*")
public class SecurityController {
	@Autowired AppUserService service;
	@Autowired
    private PasswordEncoder passwordEncoder;

	@RequestMapping("/all")
	public String all() {
		return "member/all";
	}
	@RequestMapping("/member")
	public String member() {
		return "member/member";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "member/admin";
	}
	@RequestMapping("/login")
	public String login() {
		return "member/login";
	}
	
	@RequestMapping("/fail")
	public String fail() {
		return "member/fail"; // 알림창
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join_get() {
	    return "member/join"; 
	}

	//@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')") 	   // 안에 있는 권한 중
	//@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')") // 로그인 + ADMIN 권한이 있다면
	//@PreAuthorize("isAnonymous()") // 아무나 다 글쓰기 가능
	//@PreAuthorize("isAuthenticated()")
	@PreAuthorize("isAnonymous()")
	@RequestMapping(value="/join" , 
					method=RequestMethod.POST, 
					headers=("content-type=multipart/*")) //수정기능
	public String join_post(  @RequestParam("file") MultipartFile file   
										, AppUserDto dto, RedirectAttributes rttr) { 
		// 비밀번호 암호화
        dto.setPassword(passwordEncoder.encode(dto.getPassword()));

        // 회원정보 저장 (프로필 사진 포함)
        int result = service.insert2(file, dto);
        
       
        if (result > 0) {
        	AuthDto auth = new AuthDto();
            auth.setEmail(dto.getEmail());
            auth.setAuth("ROLE_MEMBER");
            service.insertAuth(auth);

            rttr.addFlashAttribute("success", "회원가입 성공");
            return "redirect:/security/login";
        } else {
            rttr.addFlashAttribute("error", "회원가입 실패");
            return "redirect:/security/join";
        }
    }
 
	
	@RequestMapping("/mypage")
	public String mypage(Principal principal, Model model) {
		String email = principal.getName();
		model.addAttribute("dto", service.selectEmail(email));
		return "member/mypage2";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String uploadEdit_get(Model model,
	                             @AuthenticationPrincipal CustomUser principal) {
		// 로그인한 사용자 정보 가져오기
		AppUserAuthDto authDto = principal.getDto();

		// email로 회원 조회 (AppUserDto 반환)
		AppUserDto user = service.selectEmail(authDto.getEmail());


	    // 사용자 정보를 모델에 담아서 JSP로 전달
	    model.addAttribute("dto", user);

	    // 수정 화면 JSP 반환 (예: update.jsp)
	    return "update";
	}


	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String uploadEdit_post(@RequestParam("file") MultipartFile file,
	                              AppUserDto dto,
	                              RedirectAttributes rttr,
	                              @AuthenticationPrincipal CustomUser principal) {
	    String result = "비밀번호를 확인해주세요";

	    // 로그인한 사용자 정보 가져오기
	    AppUserAuthDto authDto = principal.getDto();

	    // email로 회원 조회 (AppUserDto 반환)
	    AppUserDto user = service.selectEmail(authDto.getEmail());


	    dto.setAppUserId(user.getAppUserId());
	    dto.setEmail(user.getEmail());

	    // 비밀번호 입력이 있으면 암호화해서 저장, 없으면 기존 비밀번호 유지
	    if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
	        dto.setPassword(passwordEncoder.encode(dto.getPassword()));
	    } else {
	        dto.setPassword(user.getPassword());
	    }

	    if (service.update2(file, dto) > 0) {
	        result = "수정 성공";
	    }

	    rttr.addFlashAttribute("success", result);
	    return "redirect:/mypage.users";
	}

	
	@RequestMapping("/delete")  
	public String delete_get(  ) {  
		return "member/delete"; 
	}
	
	@PreAuthorize("isAuthenticated()")
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete_post(AppUserDto dto,
	                          RedirectAttributes rttr,
	                          HttpServletRequest request,
	                          HttpServletResponse response) {

	    String result = "비밀번호를 확인해주세요";

	    // DB에서 유저 조회
	    AppUserDto user = service.select(dto.getAppUserId());

	    if (user != null) {
	        // BCrypt 검증
	        if (passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
	            if (service.deleteAdmin(dto) > 0) {
	                Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	                if (auth != null) {
	                    new SecurityContextLogoutHandler().logout(request, response, auth);
	                }
	                rttr.addFlashAttribute("success", "탈퇴 성공");
	                return "redirect:/login.users";
	            }
	        } else {
	            rttr.addFlashAttribute("deleteError", "비밀번호가 일치하지 않습니다.");
	        }
	    } else {
	        rttr.addFlashAttribute("deleteError", "회원 정보를 찾을 수 없습니다.");
	    }

	    return "redirect:/security/mypage";
	}

}
