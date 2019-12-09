package com.zty.marketing.controller;

import com.zty.marketing.dao.AdvisoryDao;
import com.zty.marketing.entity.Advisory;
import com.zty.marketing.page.Page;
import com.zty.marketing.service.AdvisoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "咨询接口")
@RestController
@RequestMapping("advisory")
@CrossOrigin
public class AdvisoryController {
    @Autowired
    private AdvisoryDao advisoryService;

    @ApiOperation(value = "增加咨询信息",notes = "{\"name\":\"晋铁\",\n" +
            "\"phone\":\"13000000000\",\n" +
            "\"project_name\":\"苏州S1线\"}")
    @PostMapping("add_advisory")
    public boolean add_advisory(@RequestBody Map map){
        return advisoryService.add_advisory(map)==1;
    }

    @ApiOperation(value = "分页模糊查询咨询信息",notes = "{\"pageNo\":1,\n" +
            "\"pageSize\":10}")
    @PostMapping("find_advisory")
    public Page<Advisory> find_advisory(@RequestBody Map map){
        Page<Advisory> page = new Page<Advisory>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(advisoryService.total(map));
        page.setItems(advisoryService.find_advisory(map));
        return page;
    }
}
