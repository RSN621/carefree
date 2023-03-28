package com.nz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nz.dao.MessageDao;
import com.nz.entity.message;
import com.nz.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * (Message)表服务实现类
 *
 * @author makejava
 * @since 2023-03-28 23:57:27
 */
@Service("messageService")
public class MessageServiceImpl extends ServiceImpl<MessageDao, message> implements MessageService {

}

