package com.wpengkang.springboot.dao;

import com.wpengkang.springboot.domain.SysUser;
import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(String id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}