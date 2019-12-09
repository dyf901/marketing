package com.zty.marketing.dao;

import com.zty.marketing.entity.Advisory;

import java.util.List;
import java.util.Map;

public interface AdvisoryDao {
    //增加咨询
    int add_advisory(Map map);

    //分页模糊查询咨询信息
    List<Advisory> find_advisory(Map map);

    //统计总数
    long total(Map map);
}
