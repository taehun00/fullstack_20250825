package com.thejoa703.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thejoa703.dto.Sboard2Dto;
import com.thejoa703.service.Sboard2Service;
import com.thejoa703.util.UtilPaging;

@Controller
@RequestMapping("/board")   // 공통 prefix
public class Sboard2Controller {
	
	@Autowired
	private Sboard2Service service;
	
	//    /board/list
	//@GetMapping("/list")
	//public String list(Model model){
	//	model.addAttribute("list", service.selectAll());
	//	return "board/list";
	//}
	@GetMapping("/list")
	public String list(Model model, @RequestParam(value="pageNo", defaultValue="1") int pageNo) {
		model.addAttribute("paging", new UtilPaging(service.selectTotalCnt(), pageNo));
		model.addAttribute("list", service.select10(pageNo));
		return "board/list";
	}
	
	
	//    /board/write (글쓰기 폼)
	@GetMapping("/write")
	public String write_get() {
		return "board/write";
	}
	
	//    /board/write (글쓰기 기능)
	@PostMapping("/write")
	public String write_post(Sboard2Dto dto, RedirectAttributes rttr, MultipartFile file) {
		String result = "글쓰기 실패";
		if(service.insert(file, dto) > 0) {
			result = "글쓰기 성공";
		}
		rttr.addFlashAttribute("success", result);
		return "redirect:/board/list";
	}
	
	//  /board/detail (상세보기)
	@GetMapping("/detail")
	public String detail(int id, Model model) {
		model.addAttribute("dto", service.select(id));
		return "board/detail";
	}
	
	//  /board/edit   (수정폼)
	@GetMapping("/edit")
	public String edit_get(int id, Model model) {
		model.addAttribute("dto", service.selectUpdateForm(id));
		return "board/edit";
	}
	
	//    /board/edit   (수정기능)
	@PostMapping("/edit")
	public String edit_post(Sboard2Dto dto, RedirectAttributes rttr, MultipartFile file) {
		String result = "수정 실패";
		if(service.update(file, dto) > 0) {
			result = "수정 성공";
		}
		rttr.addFlashAttribute("success", result);
		return "redirect:/board/detail?id=" + dto.getId();
	}
	//    /board/delete (삭제폼)
	@GetMapping("/delete")
	public String delete() {
		return "board/delete";
	}
	
	//    /board/delete (삭제기능)
	@PostMapping("/delete")
	public String delete_post(Sboard2Dto dto, RedirectAttributes rttr) {
		String result = "삭제 실패";
		if(service.delete(dto) > 0) {
			result = "삭제 성공";
		}
		rttr.addFlashAttribute("success", result);
		return "redirect:/board/list";
	}
	
	@GetMapping("/search")
	@ResponseBody
    public HashMap<String, Object> search(@RequestParam(value="keyword", required=false) String keyword,
                                              @RequestParam(value="pageNo", defaultValue = "1") int pageNo) {
		HashMap<String, Object> result = new HashMap<>();
		
        List<Sboard2Dto> list = service.selectSearch(keyword, pageNo);

        int totalCount = service.selectSearchTotalCnt(keyword);
        UtilPaging paging = new UtilPaging(totalCount, pageNo, 3, 10);
        
        result.put("list", list);
        result.put("paging", paging);
        result.put("keyword", keyword);

        return result;
    }
	

}
