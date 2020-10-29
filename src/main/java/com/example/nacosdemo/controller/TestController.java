package com.example.nacosdemo.controller;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.example.nacosdemo.config.PropertiesValue;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: LuckyBoy
 * @create: 2020-08-14 10:31
 **/
@RestController
@Api
public class TestController {

    @Resource
    private PropertiesValue propertiesValue;

    @GetMapping("/test")
    @ApiOperation(value = "你好哈哈哈哈哈")
    public String one () {
        return propertiesValue.toString();
    }

    @GetMapping("/two")
    @ApiOperation(value = "这是一个测试接口")
    public String two (@ApiParam(name = "name",value = "名字",required = true) String name) {
        return "你的名字是： " + name;
    }

}
