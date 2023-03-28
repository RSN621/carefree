package com.nz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nz.dao.ItemBrowsingHistoryDao;
import com.nz.entity.item_browsing_history;
import com.nz.service.ItemBrowsingHistoryService;
import org.springframework.stereotype.Service;


@Service
public class ItemBrowsingHistoryServiceImpl extends ServiceImpl<ItemBrowsingHistoryDao, item_browsing_history> implements ItemBrowsingHistoryService {

}

