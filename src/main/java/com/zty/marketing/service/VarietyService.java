package com.zty.marketing.service;

import com.zty.marketing.dao.VarietyDao;
import com.zty.marketing.entity.Variety;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VarietyService implements VarietyDao {
    @Autowired
    private VarietyDao varietyDao;

    @Override
    public List<Variety> select() {
        return varietyDao.select();
    }
}
