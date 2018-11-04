package com.wpengkang.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 程序内部异常处理
 * @author wpengkang
 *
 */
@Controller
@RequestMapping("err")
public class ExceptionController {
	
	@RequestMapping("/getError")
	public String getError(){
		int a = 1/0;
		return "/ok";
	}
	
}
