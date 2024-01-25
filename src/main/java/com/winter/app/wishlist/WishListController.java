package com.winter.app.wishlist;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Iterator;
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
@RequestMapping("/wishlist/*")
public class WishListController {

	@Autowired
	private WishListService wishListService;
	
	@GetMapping("add")
	public void getWishList(WishListDTO dto, HttpSession session)throws Exception {
		MemberDTO memberDTO = new MemberDTO(); 
		memberDTO = (MemberDTO)session.getAttribute("member");
		System.out.println(memberDTO.getUserName());
		WishListDTO wishListDTO = new WishListDTO();
		wishListDTO.getMemberDTO().setUserName(memberDTO.getUserName());
		wishListDTO.setProductNum(dto.getProductNum());
		
		int result = wishListService.getWishList(wishListDTO);
		
	}
	@GetMapping("list")
	public void getList(HttpSession session ,Model model, Pager pager)throws Exception {
		//찜한상품의 이름 , 이자율
		MemberDTO memberDTO = new MemberDTO();
		memberDTO = (MemberDTO)session.getAttribute("member");
		pager.setUserName(memberDTO.getUserName());

		List<ProductDTO> ar = wishListService.getList(pager);
		System.out.println(ar.size());
	model.addAttribute("list", ar);
	model.addAttribute("pager", pager);
	
	}
	@PostMapping("delete")
	public String setDelete(Long [] productNum, HttpSession session, Model model) throws Exception{
	System.out.println("asdsadasds");
		int result = 0;
		System.out.println(productNum);
		ProductDTO [] productDTOs = new ProductDTO[productNum.length];
		/*
		 배열 객체만들었어
		 productdto <객체 안만들어져있어 
		 */
		MemberDTO memberDTO = new MemberDTO(); 
		memberDTO = (MemberDTO)session.getAttribute("member");
		for(int i = 0; i<productNum.length;i++) {
			productDTOs[i] = new ProductDTO();
			productDTOs[i].setProductNum(productNum[i]);
			productDTOs[i].setUserName(memberDTO.getUserName());
			System.out.println(productNum[i]);
			result += wishListService.setDelete(productDTOs[i]);
		}
		
		this.getList(session, model, null);

		
		model.addAttribute("result",result);
		return "commons/ajaxResult";
	}
	
	{
		
	}
}
