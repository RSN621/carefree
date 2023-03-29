package com.nz.controller;

import com.nz.dao.RoleDao;
import com.nz.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleDao roleDao;

}

