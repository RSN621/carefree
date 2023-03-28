package com.nz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nz.entity.item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemDao extends BaseMapper<item> {

}

