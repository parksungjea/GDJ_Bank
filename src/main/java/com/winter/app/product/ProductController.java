package com.winter.app.product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.Pager;


@Controller
@RequestMapping(value = "/product/*")
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ReplyService replyService;
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String getDetail(ProductDTO productDTO, Model model,ReplyDTO replyDTO) throws Exception {
		productDTO = productService.getDetail(productDTO);
		replyDTO.setProductNum(productDTO.getProductNum());

		model.addAttribute("detail", productDTO);
	
		return "product/detail";
	}
	
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String getList(ProductDTO productDTO, Model model, Pager pager) throws Exception{
		
		List<ProductDTO> ar = productService.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
		return "product/list";
		
	}
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "product/add";
	}
	@RequestMapping(value = "add" , method = RequestMethod.POST)
	public String add(ProductDTO productDTO, Model model, MultipartFile [] file) throws Exception{
		int result = productService.add(productDTO,file);
		
		String msg = "실패";
		if(result>0) {
			msg="성공";
		}
		model.addAttribute("msg",msg );
		model.addAttribute("path", "list");
		return "commons/result";
	}
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update(ProductDTO productDTO, Model model)throws Exception {
		productDTO = productService.getDetail(productDTO);
		model.addAttribute("update", productDTO);
		
		return "product/update";
	}
	@RequestMapping(value = "update", method =  RequestMethod.POST)
	public String update(ProductDTO productDTO, Model model, ProductDAO productDAO)throws Exception{
		int result = productService.update(productDTO);
		
		String msg = "실패";
		if(result>0) {
			msg="성공";
		}
		
		
		model.addAttribute("path", "list");
		
		return "commons/result";
	}
	
	
}