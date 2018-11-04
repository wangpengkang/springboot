package com.wpengkang.springboot.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.wpengkang.springboot.util.JSONResultUtil;

@RestControllerAdvice
public class AllExceptionHandler {
	private static final String ERROR_HTML_NAME = "/error";
	
	@ExceptionHandler(value=Exception.class)
	public Object errorHandler(HttpServletRequest request,
			HttpServletResponse response,Exception e){
		if(isAjax(request)){
			System.out.println("====================is ajax");
			return JSONResultUtil.errorMsg(e.getMessage());
		}else{
			System.out.println("=====================is not ajax");
			ModelAndView mv = new ModelAndView();
			mv.addObject("url", request.getRequestURL());
			mv.addObject("e", e);
			mv.setViewName(ERROR_HTML_NAME);
			return mv;
		}
	}

	private boolean isAjax(HttpServletRequest request) {
		return (request.getHeader("X-Requested-With") != null && "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
	}
}
