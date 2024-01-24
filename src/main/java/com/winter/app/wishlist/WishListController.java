package com.winter.app.wishlist;

import java.lang.reflect.Member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;

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
}
