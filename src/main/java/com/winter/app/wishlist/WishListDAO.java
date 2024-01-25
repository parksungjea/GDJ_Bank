package com.winter.app.wishlist;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Repository
public class WishListDAO {
	@Autowired
	private SqlSession sqlSession;
	String namespace = "com.winter.app.wishlist.WishListDAO.";
	
	public int getWishList(WishListDTO dto)throws Exception {
		return sqlSession.insert(namespace+"getWishList", dto);
	}
	
	
	
	public List<ProductDTO> getList(Pager pager) throws Exception{
		return sqlSession.selectList(namespace+"getList", pager);
	}
	
	
	public Integer setTotalCount() throws Exception{
		return sqlSession.selectOne(namespace+"setTotalCount");
	}
	
	public int setDelete(ProductDTO  productDTOs) throws Exception{
		return sqlSession.delete(namespace+"setDelete", productDTOs);
	}
}
