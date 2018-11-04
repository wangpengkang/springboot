package com.wpengkang.springboot.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class MyExceptionHandler {
	private static final String ERROR_HTML_NAME = "/error";

	@ExceptionHandler(value=Exception.class)
	public Object errorHandler(HttpServletRequest request,
			HttpServletResponse response,Exception e) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.addObject("e", e);
		mv.addObject("url", request.getRequestURL());
		mv.setViewName(ERROR_HTML_NAME);
		return mv;
	}
}
