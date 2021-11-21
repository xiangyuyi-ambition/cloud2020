package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-07 15:10
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("server.port")
    private String serverPort;

    @GetMapping(value = "payment/hystrix/ok/{id}")
    public String payment_ok(@PathVariable Integer id){
        return "payment/hystrix/ok" + paymentService.payment_ok(id);
    }

    @GetMapping(value = "payment/hystrix/timeout/{id}")
    public String payment_timeout(@PathVariable Integer id){
        return "payment/hystrix/timeout" + paymentService.payment_timeout(id);
    }

    @GetMapping(value = "payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable Integer id){
        return  paymentService.paymentCircuitBreaker(id);
    }
}
