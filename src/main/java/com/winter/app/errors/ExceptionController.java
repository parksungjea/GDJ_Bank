package com.winter.app.errors;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(NullPointerException.class)
	public String Handler1() {
		
		return "errors/error";
	}
	
	@ExceptionHandler(Exception.class)
	public String Handler2() {
		
		return "errors/error";
	}
	
	@ExceptionHandler(Throwable.class)
	public String Handler3() {
		
		return "errors/error";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String Handler4() {
		System.out.println("Front Error 발생");
		return "errors/error";
	}
	
}
