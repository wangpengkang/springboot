package com.wpengkang.springboot.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpengkang.springboot.domain.Resource;
import com.wpengkang.springboot.util.JSONResultUtil;

@RestController
public class HelloController {
	
	@Autowired
	private Resource resource;

	@RequestMapping("/hello")
	public String hello(){
		return "Hello SpringBoot !";
	}
	
	@RequestMapping("/getResourceInfo")
	public Object getResourceInfo(){
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		
		return JSONResultUtil.ok(bean);
	}
}
