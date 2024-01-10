package com.winter.app.product;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.Pager;
@Service
public class productService {
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private ServletContext servletContext;
	
	
	public List<ProductDTO> getList(Pager pager)throws Exception {
		pager.makeRow();
		
		return productDAO.getList(pager);
		
		
	}
	public ProductDTO getDetail(ProductDTO productDTO) throws Exception{
		return productDAO.getDetail(productDTO);
	 
	}
	
	public int add(ProductDTO productDTO, MultipartFile file) throws Exception{
			//파일의 저장 위치
			int result = productDAO.add(productDTO);
			String path = servletContext.getRealPath("resources/upload");
			//파일이 있는지없는지 확인하고 없다면 만들어줌(폴더)
			File f = new File(path,"product");
			if(!f.exists()) {
				f.mkdirs();
			}
			//파일을 만들때 이름중복이 불가능하게끔 만들어주는 작업
			Calendar calendar = Calendar.getInstance();
			String filename = calendar.getTimeInMillis()+"_"+file.getOriginalFilename();
			f = new File(f,filename);
			//만든 파일을 하드디스크에 바이트로 쪼개서 저장해주는작업
			FileCopyUtils.copy(file.getBytes(), f);
			
			ProductFileDTO productFileDTO = new ProductFileDTO();
			productFileDTO.setFileName(filename);
			productFileDTO.setOriName(file.getOriginalFilename());
			productFileDTO.setProductNum(productDTO.getProductNum());
			 result = productDAO.addFile(productFileDTO);
			
			return result;
			
	}
}
