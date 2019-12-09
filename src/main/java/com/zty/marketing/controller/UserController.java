package com.zty.marketing.controller;

import com.zty.marketing.dao.UserDao;
import com.zty.marketing.entity.Msg;
import com.zty.marketing.entity.User;
import com.zty.marketing.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "登录接口")
@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserDao userService;

    @ApiOperation(value = "登录",notes = "")
    @PostMapping("login")
    public Msg login(@RequestBody Map map){
        Msg msg = new Msg();
        User user = userService.login(map);
        if(user==null){
            msg.setMessage("登录失败,账号不存在!");
            return msg;
        }else {
            if(user.getPassword().equals(map.get("password"))){
                msg.setMessage("登录成功!");
                return msg;
            }else {
                msg.setMessage("登录失败,密码错误!");
                return msg;
            }
        }
    }
}
