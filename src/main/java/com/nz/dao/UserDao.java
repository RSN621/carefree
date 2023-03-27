package com.nz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nz.entity.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<user> {
}
