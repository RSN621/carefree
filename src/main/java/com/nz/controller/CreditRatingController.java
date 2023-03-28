package com.nz.controller;


import com.nz.dao.CreditRatingDao;
import com.nz.entity.credit_rating;
import com.nz.service.CreditRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("creditRating")
public class CreditRatingController  {
    @Autowired
    private CreditRatingService creditRatingService;
    @Autowired
    private CreditRatingDao creditRatingDao;
    @RequestMapping("/Select")
    @ResponseBody
    public List<credit_rating> findAll(){
        List<credit_rating> list= creditRatingDao.selectList(null);
        return  list;
    }


}

