package com.winter.app.account;

import java.lang.reflect.Member;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping("account/*")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("add")
	public String setadd()throws Exception {
		
	return "account/add";
	}
	
	@PostMapping("add")
	public String setAdd(HttpSession session, Model model,AccountDTO accountDTO)throws Exception {
		MemberDTO at = (MemberDTO)session.getAttribute("member");
		accountDTO.setUserName(at.getUserName());
		int result = accountService.setAdd(accountDTO); 
		 
		String msg = "실패";
		if(result>0) {
			msg="성공";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("path","./list" );
		
		return "commons/result";
	}
	@GetMapping("list")
	public String getList(ProductDTO productDTO,Model model, Pager pager, HttpSession session) throws Exception{
		
		
		MemberDTO mt = (MemberDTO)session.getAttribute("member");
		pager.setSearch(mt.getUserName());
		System.out.println(pager.getSearch());
		List<ProductDTO> ar = accountService.getList(pager);
		model.addAttribute("list", ar);
		return "account/list";
		
	}
}
