package com.nz.controller;


import com.nz.dao.SearchHistoryDao;
import com.nz.entity.search_history;
import com.nz.service.SearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("searchHistory")
public class SearchHistoryController {
    @Autowired
    private SearchHistoryService searchHistoryService;
    @Autowired
    private SearchHistoryDao searchHistoryDao;
    @RequestMapping("/Select")
    @ResponseBody
    public List<search_history> findAll(){
        List<search_history> list= searchHistoryDao.selectList(null);
        return  list;
    }
}

