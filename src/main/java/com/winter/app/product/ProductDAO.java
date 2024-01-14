package com.winter.app.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProductDAO {
	@Autowired
	private SqlSession sqlSession;
	
	private String namespace = "com.winter.app.product.ProductDAO.";
	
	public int update(ProductDTO productDTO)throws Exception {
			return sqlSession.update(namespace+"update",productDTO);
	}
	
	
	public int add(ProductDTO productDTO)throws Exception {
			 return sqlSession.insert(namespace+"add",productDTO);
	}
	
	public ProductDTO getDetail(ProductDTO productDTO) {
		return sqlSession.selectOne(namespace+"getDetail", productDTO);
	}
	
	
	public List<ProductDTO> getList() throws Exception{
		return sqlSession.selectList(namespace+"getList");
		
	}

}
