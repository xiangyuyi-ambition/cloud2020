package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-08 18:41
 **/
@RestController
@RefreshScope
public class ConfigController {

    @Value("${test.ok}")
    private String  testOk;

    @GetMapping("/config")
    public String getPost(){
        return testOk;
    }
}
