package com.zty.marketing.dao;

import com.zty.marketing.entity.Message;

import java.util.List;
import java.util.Map;

public interface MessageDao {
    //增加留言信息
    int add_message(Map map);

    //分页模糊查询留言信息
    List<Message> find_message(Map map);

    //统计总数
    long total(Map map);
}
