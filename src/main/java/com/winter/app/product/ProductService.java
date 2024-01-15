package com.winter.app.product;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.FileManager;

@Service
public class ProductService {
		@Autowired
		private ProductDAO productDAO;
		@Autowired
		private ServletContext context;
		@Autowired
		private FileManager fileManager;
		
		
		
		public int update(ProductDTO productDTO)throws Exception {
			return productDAO.update(productDTO);
		}
		
		
		
		public int add(ProductDTO productDTO, MultipartFile [] file)throws Exception {
			int result = productDAO.add(productDTO);
			
			String path = context.getRealPath("resources/upload/products");
			
			for(MultipartFile f : file) {
				if(f.isEmpty()) {
					continue;
				}
				String filename = fileManager.fileSave(path, f);			
				ProductFileDTO fileDTO = new ProductFileDTO();
				fileDTO.setFileName(filename);
				fileDTO.setOriName(f.getOriginalFilename());
				fileDTO.setProductNum(productDTO.getProductNum());
				result =productDAO.File(fileDTO);
				
				return result;
				
			}
				
			
			
			
			return result;
		}
		
		
		public List<ProductDTO> getList() throws Exception{
			return productDAO.getList();
		}
		
		
		public ProductDTO getDetail(ProductDTO productDTO) throws Exception{
			return productDAO.getDetail(productDTO);
		}
}
