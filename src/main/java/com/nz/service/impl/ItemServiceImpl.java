package com.nz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nz.dao.ItemDao;
import com.nz.entity.item;
import com.nz.service.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends ServiceImpl<ItemDao, item> implements ItemService {

}

