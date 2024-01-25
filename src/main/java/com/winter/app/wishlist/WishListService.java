package com.winter.app.wishlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Service
public class WishListService {
	@Autowired
	private WishListDAO wishListDAO;
	
	public int getWishList(WishListDTO dto)throws Exception {
			return wishListDAO.getWishList(dto);
	}
	
	
	
	public List<ProductDTO> getList(Pager pager)throws Exception {
		pager.makeRow();
		System.out.println(pager.getStart_Num());
		System.out.println(pager.getLast_Num());
		Integer totalCount = wishListDAO.setTotalCount();
		System.out.println(totalCount);
		pager.makeNum(totalCount);
		
		
		return wishListDAO.getList(pager);
		
		
	}
	
	public	int setDelete(ProductDTO  productDTOs)throws Exception {
		return wishListDAO.setDelete(productDTOs);
	}
}
