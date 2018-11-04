package com.wpengkang.springboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpengkang.springboot.domain.User;
import com.wpengkang.springboot.util.JSONResultUtil;

@RestController
@RequestMapping("user")
public class UserController {

	@RequestMapping("/getUser")
	public User getUser(){
		
		User u = new User();
		u.setName("imooc");
		u.setAge(21);
		u.setPassword("imooc");
		u.setBirthday(new Date());
		u.setDescription("hello Springboot!");
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
	public Object getUserJson(){
		
		User u = new User();
		u.setName("imooc");
		u.setAge(19);
		u.setPassword("imooc");
		u.setBirthday(new Date());
		u.setDescription("hello Springboot!");
		
		return JSONResultUtil.ok(u);
	}
}
