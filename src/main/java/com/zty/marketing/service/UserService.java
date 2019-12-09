package com.zty.marketing.service;

import com.zty.marketing.dao.UserDao;
import com.zty.marketing.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class UserService implements UserDao {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(Map map) {
        return userDao.login(map);
    }
}
