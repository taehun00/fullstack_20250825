package com.thejoa703.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thejoa703.dto.AppUserDto;
import com.thejoa703.service.AppUserService;

@Controller
public class UserController {
	@Autowired AppUserService service;
	
	@RequestMapping("/list.users")
	public String list(Model model) {
		model.addAttribute("list", service.selectAll());
		return "member/list";
	}
	
	@RequestMapping(value="/join.users", method= RequestMethod.GET)
	public String join_get() {
		
		return "member/join";
	}
	
	@RequestMapping(value="/join.users", method= RequestMethod.POST)
	public String join_post(@RequestParam(value="file", required=false) MultipartFile file, AppUserDto dto, RedirectAttributes rttr) {
		String result = "회원가입 실패";
		
		if(service.join(dto.getEmail()) == 0) {
			if(service.insert2(file, dto) > 0)

			result = "회원가입 성공";
		}
		

		rttr.addFlashAttribute("success", result);
		return "redirect:/login.users";
	}
	
	@RequestMapping(value="/login.users", method= RequestMethod.GET)
	public String login_get() {
		
		return "member/login";
	}
	
	@RequestMapping(value="/login.users", method= RequestMethod.POST)
	public String login_post(AppUserDto dto, RedirectAttributes rttr, HttpSession session) {
		String result = "로그인 실패";
				
		AppUserDto loginUser = service.login(dto);
		if(loginUser != null) {
		    result = "로그인 성공";
		    session.setAttribute("loginUser", loginUser);
		    rttr.addFlashAttribute("success", result);
		    return "redirect:/mypage.users";
		} else {
		    rttr.addFlashAttribute("success", result);
		    return "redirect:/login.users";
		}

	}
	
	@RequestMapping("mypage.users")
	public String mypage(HttpSession session, Model model) {
		AppUserDto loginUser = (AppUserDto) session.getAttribute("loginUser");
		//DB에서 최신데이터 조회 코드
		AppUserDto dto = service.select(loginUser.getAppUserId());
		model.addAttribute("user", dto);
		
		return "member/mypage";
	}
	
	@RequestMapping(value="/edit.users", method= RequestMethod.GET)
	public String edit_get(int id, Model model) {
		model.addAttribute("dto", service.select(id));
		
		return "member/edit";
	}
	
	@RequestMapping(value="/edit.users", method= RequestMethod.POST)
	public String edit_post(AppUserDto dto, RedirectAttributes rttr) {
		String result = "수정 실패";
		
		if(service.update(dto)>0) {
			result = "수정 성공";
		}
		
		rttr.addFlashAttribute("success", result);
		
		return "redirect:/mypage.users?id=" + dto.getAppUserId();
	}
	
	@RequestMapping(value= "/delete.users", method= RequestMethod.GET)
	public String delete(AppUserDto dto, Model model) {
		model.addAttribute("dto", dto);
		
		return "member/delete";
	}
	@RequestMapping(value= "/delete.users", method= RequestMethod.POST)
	public String delete(AppUserDto dto, RedirectAttributes rttr) {
		String result = "삭제 실패";
		
		if(service.delete(dto)>0) {
			result="삭제 성공";
		}
		
		rttr.addFlashAttribute("success", result);
		return "redirect:/list.users";
	}
	
	
	
	@RequestMapping("logout.users")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login.users";
	}
	
	
	@RequestMapping(value="/updateEdit.users", method=RequestMethod.POST)
	public String updateEdit_post(@RequestParam("file") MultipartFile file, AppUserDto dto, RedirectAttributes rttr) {
		String result = "비밀번호를 확인해주세요";
		
		if(service.update2(file, dto)>0) {result = "수정 성공"; }
		rttr.addFlashAttribute("success", result);
		return "redirect:/mypage.users?id=" + dto.getAppUserId();
	}
}
