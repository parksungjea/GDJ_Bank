package com.winter.app.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.winter.app.util.Pager;

@Repository
public class ProductDAO {
	@Autowired
	private SqlSession sqlSession;
	String namespace = "com.winter.app.product.ProductDAO.";
	
	
	public List<ProductDTO> getList(Pager pager) throws Exception{
		
		
		return sqlSession.selectList(namespace+"getlist", pager);
		
		
	}

}
