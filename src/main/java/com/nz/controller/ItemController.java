package com.nz.controller;


import com.nz.dao.ItemDao;
import com.nz.entity.item;
import com.nz.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController{
    @Autowired
    private ItemService itemService;
    @Autowired
    private ItemDao itemDao;
    @RequestMapping("/Select")
    @ResponseBody
    public List<item> findAll(){
        List<item> list= itemDao.selectList(null);
        return  list;
    }
}

