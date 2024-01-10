package com.winter.app.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.Pager;

@Repository
public class ProductDAO {
	@Autowired
	private SqlSession sqlSession;
	
	private String namespace ="com.winter.app.product.ProductDAO.";
	
//	
//	public Long total(Pager pager) {
//		return sqlSession.selectOne(namespace+"total", pager);
//	}
	
	public int addFile(ProductFileDTO productFileDTO) throws Exception{
			return sqlSession.insert(namespace+"addFile", productFileDTO);
	}
	
	public int add(ProductDTO productDTO) throws Exception{
		int result = sqlSession.insert(namespace+"add", productDTO);
		return result;
	}
	
	public List<ProductDTO> getList(Pager pager) throws Exception{
		
		
		return sqlSession.selectList(namespace+"getList", pager);
		
		
	}
	
	public ProductDTO getDetail(ProductDTO productDTO)throws Exception {
		return sqlSession.selectOne(namespace+"getDetail", productDTO);
	}

}
