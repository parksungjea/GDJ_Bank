package com.winter.app.errors;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Repository("/errors/*")
public class errorController {

	@GetMapping("/error400")
	public String error400() {
		
			return "errors/error";
		
	}
}
