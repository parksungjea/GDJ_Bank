package com.winter.app.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.errors.MemberLoginException;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Autowired
	private MemberService memberService; 
	
	
	
	
	
	@ExceptionHandler(MemberLoginException.class)
	public String memberLoginException(Exception e,Model model ) {
		String m = e.getMessage();
		model.addAttribute("msg", m);
		return "member/login";
	}
	
	
	@GetMapping("idCheck")
	public String getidCheck(MemberDTO memberDTO, Model model)throws Exception {
		memberDTO = memberService.getDetail(memberDTO);
		int result = 0;
		if(memberDTO == null) {
			result = 1;
		}
		model.addAttribute("result", result);
		return "commons/ajaxResult";
		
	}
	
	
	@GetMapping("logout")
	public String getLogout(HttpSession session) {
		//session.setAttribute("member", null);
		//session.removeValue("member");
		//session.removeValue("member");
		session.invalidate();
		return "redirect:../";
	}
	@GetMapping("update")
	public void setUpdate(HttpSession session, Model model)throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		memberDTO = memberService.getDetail(memberDTO);
		model.addAttribute("member", memberDTO);
	}
	
	
	@PostMapping("update")
	public String setUpdate(MemberDTO memberDTO,HttpSession httpSession , Model model)throws Exception {
		//DB에 업데이트 후 mypage로 리다이렉트
		MemberDTO m = (MemberDTO)httpSession.getAttribute("member");
		memberDTO.setUserName(m.getUserName());
		
		 int result = memberService.setUpdate(memberDTO);
		 
		 return "redirect:./mypage";
	}
	
	
	@GetMapping("login")
	public String setLogin()throws Exception {
		
		return "member/login";
	}
	
	@PostMapping("login")
	public String setLogin(MemberDTO memberDTO, Model model ,HttpSession session)throws Exception {
		memberDTO = memberService.getLogin(memberDTO);
		
		if(memberDTO == null) {
			model.addAttribute("msg","id또는pw를 확인해보려무나");
			return "member/login";
		}
		
		session.setAttribute("member", memberDTO);
		//request.getSession();
		return "redirect:../";
	}
	
	
	@GetMapping("join")
	public String setJoin()throws Exception {
		
		return "member/join";
		
	}
	@PostMapping("join")
	public String setJoin(MemberDTO memberDTO,MultipartFile attachs,Model model)throws Exception {
		
		int result = memberService.setJoin(memberDTO, attachs);
		
		String msg = "실패";
		if(result>0) {
			
			msg = "성공";
		}
		
		
		model.addAttribute("msg", msg);
		model.addAttribute("path", "/");
		
		
		return "commons/result";
	}
	
	@GetMapping("agreement")
	public void setAgreement()throws Exception {
		
	}
	
	@GetMapping("mypage")
	public String setMyPage(HttpSession session, Model model)throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		memberDTO = memberService.getDetail(memberDTO);
		model.addAttribute("member", memberDTO);
	
		return "member/mypage";
		
	}
	
}
