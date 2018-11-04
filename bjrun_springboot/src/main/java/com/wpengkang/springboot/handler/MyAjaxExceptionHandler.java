package com.wpengkang.springboot.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wpengkang.springboot.util.JSONResultUtil;

//@RestControllerAdvice
public class MyAjaxExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public JSONResultUtil errorHandler(HttpServletRequest request,
			HttpServletResponse response,Exception e){
		
		return JSONResultUtil.errorMsg(e.getMessage());
	}
}
