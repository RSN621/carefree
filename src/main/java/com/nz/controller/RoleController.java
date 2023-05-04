package com.nz.controller;

import com.nz.dao.RoleDao;
import com.nz.entity.role;
import com.nz.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleDao roleDao;
    @RequestMapping("/Select")
    @ResponseBody
    public List<role> findAll(){
        List<role> list= roleDao.selectList(null);
        return  list;
    }

}

