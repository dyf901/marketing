package com.zty.marketing.controller;

import com.zty.marketing.entity.Variety;
import com.zty.marketing.service.VarietyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "种类接口")
@RestController
@RequestMapping("variety")
@CrossOrigin
public class VarietyController {
    @Autowired
    private VarietyService varietyService;

    @ApiOperation(value = "下拉框查询",notes = "")
    @PostMapping("select")
    public List<Variety> select(){
        return varietyService.select();
    }
}
