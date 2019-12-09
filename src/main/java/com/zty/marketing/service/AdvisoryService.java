package com.zty.marketing.service;

import com.zty.marketing.dao.AdvisoryDao;
import com.zty.marketing.entity.Advisory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class AdvisoryService implements AdvisoryDao {
    @Autowired
    private AdvisoryDao advisoryDao;

    //增加咨询
    @Override
    public int add_advisory(Map map) {
        return advisoryDao.add_advisory(map);
    }

    //分页模糊查询咨询信息
    @Override
    public List<Advisory> find_advisory(Map map) {
        return advisoryDao.find_advisory(map);
    }

    //统计总数
    @Override
    public long total(Map map) {
        return advisoryDao.total(map);
    }
}
