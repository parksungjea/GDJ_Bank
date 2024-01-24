package com.winter.app.wishlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.product.ProductDTO;

@Service
public class WishListService {
	@Autowired
	private WishListDAO wishListDAO;
	
	public int getWishList(WishListDTO dto)throws Exception {
			return wishListDAO.getWishList(dto);
	}
}
