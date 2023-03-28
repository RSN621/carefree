package com.nz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nz.dao.TransactionDao;
import com.nz.entity.transaction;
import com.nz.service.TransactionService;
import org.springframework.stereotype.Service;


@Service
public class TransactionServiceImpl extends ServiceImpl<TransactionDao, transaction> implements TransactionService {

}

