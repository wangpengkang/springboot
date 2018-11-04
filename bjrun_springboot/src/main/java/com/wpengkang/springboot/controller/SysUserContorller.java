package com.wpengkang.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpengkang.springboot.domain.SysUser;
import com.wpengkang.springboot.service.SysUserService;

@RestController
@RequestMapping("/sysuser")
public class SysUserContorller {
	
	@Autowired
	private SysUserService sysUSerService;
	
	@RequestMapping("insertSysUser")
	public void insertSysUser(SysUser sysUser){
		sysUSerService.insertSysUser(sysUser);
	}
	
	@RequestMapping("deleteSysUser")
	public void deleteSysUser(String id){
		sysUSerService.deleteSysUser(id);
	}
	
	@RequestMapping("selectAllSysUser")
	public List<SysUser> selectAllSysUser(int pageNum,int pageSize){
		return sysUSerService.selectAllSysUser(pageNum,pageSize);
	}
	
	@RequestMapping("updateSysUser")
	public void updateSysUser(SysUser sysUser){
		sysUSerService.updateSysUser(sysUser);
	}
	
	
}
