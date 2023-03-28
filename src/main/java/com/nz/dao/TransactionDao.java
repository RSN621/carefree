package com.nz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nz.entity.transaction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransactionDao extends BaseMapper<transaction> {

}

