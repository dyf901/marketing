package com.zty.marketing.controller;

import com.zty.marketing.dao.MessageDao;
import com.zty.marketing.entity.Message;
import com.zty.marketing.page.Page;
import com.zty.marketing.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "留言接口")
@RestController
@RequestMapping("message")
@CrossOrigin
public class MessageController {
    @Autowired
    private MessageDao messageService;

    @ApiOperation(value = "增加留言信息",notes = "{\"name\":\"晋铁\",\n" +
            "\"phone\":\"13000000000\",\n" +
            "\"email\":\"jintie@qq.com\",\n" +
            "\"content\":\"页面某部分有问题\"}")
    @PostMapping("add_message")
    public boolean add_message(@RequestBody Map map){
        return messageService.add_message(map)==1;
    }

    @ApiOperation(value = "分页模糊查询留言信息",notes = "{\"pageNo\":1,\n" +
            "\"pageSize\":10}")
    @PostMapping("find_message")
    public Page<Message> find_message(@RequestBody Map map){
        Page<Message> page = new Page<Message>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(messageService.total(map));
        page.setItems(messageService.find_message(map));
        return page;
    }
}
