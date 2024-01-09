package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/product/*" ,method = RequestMethod.GET)
public class ProductController {
	@Autowired
	private productService productService;
	
	@RequestMapping(value = "list", method = RequestMethod.GET )
	public String getList(Pager pager, Model model) throws Exception{
		List<ProductDTO> ar = productService.getList(pager);
		
		model.addAttribute("list", ar);
		return "product/list";
	}
	
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public String getDetail(ProductDTO productDTO, Model model) throws Exception{
	productDTO =productService.getDetail(productDTO);
		model.addAttribute("detail", productDTO);
		return "product/detail";
	}
	
	public String add(ProductDTO productDTO, Model model) throws Exception {
	int a = productService.add(productDTO);
		model.addAttribute("add", a);
		return "product/add";
	}
	
	

}
