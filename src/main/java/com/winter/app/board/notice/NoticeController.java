package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.board.BoardService;
import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/notice/*")
public class NoticeController {
	@Autowired
	@Qualifier("noticeService")
	private BoardService boardService;
	
	
	@ModelAttribute("bbs")
	public Integer getKind()throws Exception {
		return 0;
		
	}
	
	
	@ModelAttribute("board")
	public String getBoard() throws Exception{
		return "notice";
		
	}
	
	//list
	//@RequestMapping(value = "list", method = RequestMethod.GET)
	@GetMapping(value =  "list")
	public String getList(Pager pager, Model model)throws Exception {
		List<BoardDTO> ar = boardService.getList(pager);
		
		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
		
		return "board/list";
		
	}
	@GetMapping(value = "detail")
	public String getDetail(BoardDTO boardDTO, Model model)throws Exception {
		boardDTO = (NoticeDTO)boardService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		
		return "board/detail";
	
	}
	@GetMapping(value = "add")
	public String setadd()throws Exception{
		return "board/add";
		
	}
	@PostMapping( value = "add")
	public String setadd(BoardDTO boardDTO, MultipartFile [] attachs, Model model)throws Exception {
		int result = boardService.setAdd(boardDTO, attachs);
		
		return "redirect:./list";
		
	}
	
	@PostMapping("delete")
	public String setDelete(NoticeDTO boardDTO)throws Exception{
		
		int result = boardService.setDelete(boardDTO);
		return "redirect:./list";
	}
	@GetMapping("update")
	public String setUpdate(BoardDTO boardDTO, Model model) throws Exception{
		boardDTO = boardService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "board/update";
	}
	
	@PostMapping("update")
	public String setUpdate(BoardDTO boardDTO, MultipartFile [] attachs) throws Exception{
		int result = boardService.setUpdate(boardDTO, attachs);
		
		return "redirect:./list";
	}
	
	
	
}
