package com.thejoa703.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public String join_post(AppUserDto dto, RedirectAttributes rttr) {
		String result = "회원가입 실패";
		
		if(service.insert(dto) > 0) {result = "회원가입 성공";}
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
				
		if(service.login(dto) !=null) {
		result = "로그인 성공";
		session.setAttribute("loginUser", service.login(dto));
		
		}
		
		//rttr.addFlashAttribute("userlist", service.login(dto));
		rttr.addFlashAttribute("success", result);
		
		return "redirect:/mypage.users";
		
	}
	
	@RequestMapping("mypage.users")
	public String mypage(HttpSession session, Model model) {
		AppUserDto dto = (AppUserDto) session.getAttribute("loginUser");
		model.addAttribute("user", dto);
		
		return "member/mypage";
	}
	
	@RequestMapping(value="/edit.users", method= RequestMethod.GET)
	public String edit_get() {
		
		return "member/edit";
	}
	
	@RequestMapping(value="/edit.users", method= RequestMethod.POST)
	public String edit_post() {
		
		return "redirect:/mypage.users";
	}
	
	@RequestMapping("delete.users")
	public String delete() {
		
		return "redirect:/list.users";
	}
	
	
	
	@RequestMapping("logout.users")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login.users";
	}
}
