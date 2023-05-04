package com.nz.controller;


import com.nz.dao.ItemDao;
import com.nz.entity.item;
import com.nz.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        ArrayList<Integer> l1=new ArrayList<>();
        l1= (ArrayList<Integer>) map.get("selectedRowId");
        boolean result=itemService.removeById(l1.get(0));
        return result;
    }
}

