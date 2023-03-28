package com.nz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nz.dao.CreditRatingDao;
import com.nz.entity.credit_rating;
import com.nz.service.CreditRatingService;
import org.springframework.stereotype.Service;


@Service
public class CreditRatingServiceImpl extends ServiceImpl<CreditRatingDao, credit_rating> implements CreditRatingService {

}

