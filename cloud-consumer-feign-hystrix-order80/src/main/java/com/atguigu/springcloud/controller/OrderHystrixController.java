package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-07 16:50
 **/
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "global_hystrix_Handler")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String payment_ok(@PathVariable Integer id){
        return paymentHystrixService.payment_ok(id);
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "timeoutHandler", commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "2000")
//    })
    @HystrixCommand
    public String payment_timeout(@PathVariable("id") Integer id){
        return paymentHystrixService.payment_timeout(id);
    }


    public String timeoutHandler(@PathVariable("id") Integer id){
        return "消费者80端通过Feign调用超时或者发生异常Hystrix处理 id:" + id;
    }

    public String global_hystrix_Handler(){
        return "global_hystrix_Handler异常处理";
    }
}
