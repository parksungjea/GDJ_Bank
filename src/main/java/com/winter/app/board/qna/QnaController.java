package com.winter.app.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.board.BoardDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/qna/*")
public class QnaController {
	@Autowired
	private QnaService noticeService;
	
	
	@GetMapping(value = "list")
	public String getList(Pager pager, Model model) throws Exception{
		List<BoardDTO> ar = noticeService.getList(pager);
		model.addAttribute("list", ar);
		return "board/list";
		
		
	}
	@GetMapping(value = "add")
	public String setAdd()throws Exception {
	return "board/add";	
		
	}
	@PostMapping(value = "add")
	public String setAdd(BoardDTO boardDTO)throws Exception {
		int result = noticeService.setAdd(boardDTO);
		return "redirect:./list";
		
	}
	
}
