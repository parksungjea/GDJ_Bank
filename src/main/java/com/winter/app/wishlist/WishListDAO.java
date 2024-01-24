package com.winter.app.wishlist;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.product.ProductDTO;

@Repository
public class WishListDAO {
	@Autowired
	private SqlSession sqlSession;
	String namespace = "com.winter.app.wishlist.WishListDAO.";
	
	public int getWishList(WishListDTO dto)throws Exception {
		return sqlSession.insert(namespace+"getWishList", dto);
	}
	
}
