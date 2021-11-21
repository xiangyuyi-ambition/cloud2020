package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-06 18:29
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("server.port")
    private String serverPost;

    @RequestMapping(value = "payment/consul")
    public String paymentConsul(){
        return "springcloud with consule" + serverPost + UUID.randomUUID().toString();
    }
}
