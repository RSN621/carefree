package com.nz.controller;

import com.nz.dao.RoleDao;
import com.nz.dao.UserDao;
import com.nz.entity.role;
import com.nz.entity.user;
import com.nz.service.RoleService;
import com.nz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleDao roleDao;
    @RequestMapping("/Select")
    @ResponseBody
    public List<user> findAll(){
        List<user> list= userDao.selectList(null);
        return  list;
    }
    @RequestMapping("/login")
    @ResponseBody
    public boolean login(String userName,String password){
        System.out.println(userName+password);
        return true;
    }
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public List getUserInfo(String id){
        id= String.valueOf(1);
        role role=roleDao.selectById(id);
        user user=userDao.selectById(id);
        List l1=new ArrayList();
        l1.add(role.getId());
        l1.add(user.getName());
        l1.add(user.getEmail());
        l1.add(role.getUser_role());
        return l1;
    }
}
