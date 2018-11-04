package com.wpengkang.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpengkang.springboot.domain.Resource;
/**
 * freemarker模块引擎学习
 * @author wpengkang
 *
 */
@Controller
@RequestMapping("ftl")
public class FreeMarkerController {
	
	@Autowired
	private Resource resource;

	@RequestMapping("/center")
	public String center(){
		return "/freemarker/center/center";
	}
	
	@RequestMapping("/index")
	public String index(ModelMap model){
		model.addAttribute("resource", resource);
		return "/freemarker/index";
	}
}
