package com.nz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nz.entity.message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageDao extends BaseMapper<message> {

}

