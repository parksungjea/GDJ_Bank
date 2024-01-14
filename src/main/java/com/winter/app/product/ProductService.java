package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
		@Autowired
		private ProductDAO productDAO;
		
		
		
		public int update(ProductDTO productDTO)throws Exception {
			return productDAO.update(productDTO);
		}
		
		public int add(ProductDTO productDTO)throws Exception {
			return productDAO.add(productDTO);
		}
		
		
		public List<ProductDTO> getList() throws Exception{
			return productDAO.getList();
		}
		
		
		public ProductDTO getDetail(ProductDTO productDTO) throws Exception{
			return productDAO.getDetail(productDTO);
		}
}
