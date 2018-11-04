package com.wpengkang.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wpengkang.springboot.util.JSONResultUtil;
/**
 * ajax异常处理
 * @author wpengkang
 *
 */
@Controller
@RequestMapping("err")
public class AjaxExceptionController {
	
	@RequestMapping("/toAjaxHtml")
	public String toAjaxHtml(){
		return "/ajaxhtml";
	}
	
	@RequestMapping("/getAjaxError")
	@ResponseBody
	public Object getAjaxError(){
		int a = 1/0;
		return JSONResultUtil.ok("请求成功");
	}
	
}
