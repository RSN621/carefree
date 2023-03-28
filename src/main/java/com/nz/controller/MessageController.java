package com.nz.controller;


import com.nz.dao.MessageDao;
import com.nz.entity.message;
import com.nz.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @Autowired
    private MessageDao messageDao;
    @RequestMapping("/Select")
    @ResponseBody
    public List<message> findAll(){
        List<message> list= messageDao.selectList(null);
        return  list;
    }

}

