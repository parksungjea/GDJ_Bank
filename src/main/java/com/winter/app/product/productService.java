package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.util.Pager;
@Service
public class productService {
	@Autowired
	private ProductDAO productDAO;
	
	public List<ProductDTO> getList(Pager pager)throws Exception {
		pager.makeRow();
		return productDAO.getList(pager);
		
		
	}
	public ProductDTO getDetail(ProductDTO productDTO) throws Exception{
		return productDAO.getDetail(productDTO);
	 
	}
	
	public int add(ProductDTO productDTO) throws Exception{
		
		return productDAO.add(productDTO);
	}
}
