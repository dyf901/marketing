package com.zty.marketing.dao;

import com.zty.marketing.entity.User;

import java.util.Map;

public interface UserDao {
    User login(Map map);
}
