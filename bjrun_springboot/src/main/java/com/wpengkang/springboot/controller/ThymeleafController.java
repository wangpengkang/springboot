package com.wpengkang.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wpengkang.springboot.domain.User;
/**
 * thymeleaf模板引擎学习
 * @author wpengkang
 *
 */
@Controller
@RequestMapping("th")
public class ThymeleafController {

	@RequestMapping("/center")
	public String center(){
		return "/thymeleaf/center/center";
	}
	
	@RequestMapping("/index")
	public String index(ModelMap model){
		model.addAttribute("name", "thymeleaf-test");
		return "/thymeleaf/index";
	}
	
	@RequestMapping("/test")
	public String test(ModelMap model){
		
		User u = new User();
		u.setName("zhangsan");
		u.setAge(16);
		u.setPassword("******");
		u.setBirthday(new Date());
		u.setDescription("<font color='green'><b>个人简介</b></font>");
		
		User u1 = new User();
		u1.setName("lisi");
		u1.setAge(18);
		u1.setPassword("******");
		u1.setBirthday(new Date());
		u1.setDescription("<font color='green'><b>个人简介</b></font>");
		
		User u2 = new User();
		u2.setName("wangwu");
		u2.setAge(20);
		u2.setPassword("******");
		u2.setBirthday(new Date());
		u2.setDescription("<font color='green'><b>个人简介</b></font>");
		
		List<Object> list = new ArrayList<Object>();
		list.add(u);
		list.add(u1);
		list.add(u2);
		model.addAttribute("user", u1);
		model.addAttribute("userList", list);
		
		return "/thymeleaf/test";
	}
	
	@PostMapping("/postForm")
	public String postForm(User u,HttpServletRequest request,HttpServletResponse response){
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("姓名=========>"+name);
		System.out.println("年龄=========>"+age);
		System.out.println("姓名:"+u.getName());
		System.out.println("年龄:"+u.getAge());
		return "redirect:/th/test";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
