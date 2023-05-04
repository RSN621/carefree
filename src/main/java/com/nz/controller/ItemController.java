package com.nz.controller;


import com.nz.dao.ItemDao;
import com.nz.entity.item;
import com.nz.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
    @RequestMapping("/deleteById")
    @ResponseBody
    public boolean deleteById(@RequestBody Map map){
        System.out.println(map);
        int id= (Integer) map.get("id");
        System.out.println(id);
        boolean result=itemService.removeById(id);
        return result;
    }
}

