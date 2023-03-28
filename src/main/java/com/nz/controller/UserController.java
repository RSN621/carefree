package com.nz.controller;

import com.nz.dao.UserDao;
import com.nz.entity.user;
import com.nz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;
    @RequestMapping("/Select")
    @ResponseBody
    public List<user> findAll(){
        List<user> list= userDao.selectList(null);
        return  list;
    }
}
