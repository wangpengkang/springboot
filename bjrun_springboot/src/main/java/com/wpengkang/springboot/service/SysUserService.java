package com.wpengkang.springboot.service;

import java.util.List;

import com.wpengkang.springboot.domain.SysUser;

public interface SysUserService {
	public int insertSysUser(SysUser sysUser);

	public int deleteSysUser(String id);

	public List<SysUser> selectAllSysUser(int pageNum,int pageSize);

	public int updateSysUser(SysUser sysUser);
}
