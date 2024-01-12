package com.winter.app.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/product/*")
public class ProductController {
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void getList() throws Exception{
		
	}
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "product/add";
	}
	
}
