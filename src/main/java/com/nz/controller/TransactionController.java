package com.nz.controller;


import com.nz.dao.TransactionDao;
import com.nz.entity.transaction;
import com.nz.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private TransactionDao transactionDao;
    @RequestMapping("/Select")
    @ResponseBody
    public List<transaction> findAll(){
        List<transaction> list= transactionDao.selectList(null);
        return  list;
    }
}

