package com.zty.marketing.service;

import com.zty.marketing.dao.MessageDao;
import com.zty.marketing.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class MessageService implements MessageDao {
    @Autowired
    private MessageDao messageDao;

    //增加留言信息
    @Override
    public int add_message(Map map) {
        return messageDao.add_message(map);
    }

    //分页模糊查询留言信息
    @Override
    public List<Message> find_message(Map map) {
        return messageDao.find_message(map);
    }

    //统计总数
    @Override
    public long total(Map map) {
        return messageDao.total(map);
    }
}
