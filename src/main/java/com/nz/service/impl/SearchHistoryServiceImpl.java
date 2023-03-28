package com.nz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nz.dao.SearchHistoryDao;
import com.nz.entity.search_history;
import com.nz.service.SearchHistoryService;
import org.springframework.stereotype.Service;

@Service
public class SearchHistoryServiceImpl extends ServiceImpl<SearchHistoryDao, search_history> implements SearchHistoryService {

}

