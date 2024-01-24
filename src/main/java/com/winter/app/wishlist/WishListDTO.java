package com.winter.app.wishlist;

import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;

public class WishListDTO {

	private Long productNum;
	private MemberDTO memberDTO= new MemberDTO();

	public MemberDTO getMemberDTO() {
		return memberDTO;
	}
	public void setMemberDTO(MemberDTO memberDTO) {
		this.memberDTO = memberDTO;
	}
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
}
