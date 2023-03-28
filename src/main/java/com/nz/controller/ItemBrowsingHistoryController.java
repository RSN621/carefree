package com.nz.controller;


import com.nz.dao.ItemBrowsingHistoryDao;
import com.nz.entity.item_browsing_history;
import com.nz.service.ItemBrowsingHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("itemBrowsingHistory")
public class ItemBrowsingHistoryController {
    @Autowired
    private ItemBrowsingHistoryService itemBrowsingHistoryService;
    @Autowired
    private ItemBrowsingHistoryDao itemBrowsingHistoryDao;
    @RequestMapping("/Select")
    @ResponseBody
    public List<item_browsing_history> findAll(){
        List<item_browsing_history> list= itemBrowsingHistoryDao.selectList(null);
        return  list;
    }

}

