package com.winter.app.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Autowired
	private MemberService memberService; 
	
	@GetMapping("logout")
	public String getLogout(HttpSession session) {
		//session.setAttribute("member", null);
		//session.removeValue("member");
		//session.removeValue("member");
		session.invalidate();
		return "redirect:../";
	}
	@GetMapping("update")
	public void setUpdate()throws Exception {
		
	}
	@PostMapping("update")
	public String setUpdate(MemberDTO memberDTO,HttpSession httpSession , Model model)throws Exception {
		//DB에 업데이트 후 mypage로 리다이렉트
		MemberDTO m = (MemberDTO)httpSession.getAttribute("member");
		memberDTO.setUserName(m.getUserName());
		memberDTO.setAvatarFileDTO(m.getAvatarFileDTO());
		 int result = memberService.setUpdate(memberDTO);
		 httpSession.setAttribute("member", memberDTO);
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
	
	@GetMapping("mypage")
	public String setMyPage(MemberDTO memberDTO, HttpSession session, MultipartFile file)throws Exception {

	
		
		
	return "member/mypage";
		
	}
	
}
