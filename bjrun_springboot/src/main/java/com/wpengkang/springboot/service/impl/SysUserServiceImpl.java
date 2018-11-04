package com.wpengkang.springboot.service.impl;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.wpengkang.springboot.dao.SysUserMapper;
import com.wpengkang.springboot.domain.SysUser;
import com.wpengkang.springboot.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public int insertSysUser(SysUser sysUser) {
		if(sysUser.getId() == null || "".equals(sysUser.getId())){
			sysUser.setId(UUID.randomUUID().toString().replace("-", ""));
		}
		return sysUserMapper.insert(sysUser);
	}

	@Override
	public int deleteSysUser(String id) {
		return sysUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<SysUser> selectAllSysUser(int pageNum,int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return sysUserMapper.selectAll();
	}
	
	@Override
	public int updateSysUser(SysUser sysUser) {
		return sysUserMapper.updateByPrimaryKey(sysUser);
	}
	
}
