package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.flow.controller.RateLimiterController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-11-19 14:39
 **/
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "A";
    }

    @GetMapping("/testB")
    public String testB(){
        System.out.println(Thread.currentThread().getName() + "....testB");
        return "B";
    }

    @GetMapping("/testD")
    public String testD() throws Exception{
        //测试RT
        //TimeUnit.SECONDS.sleep(1);
        // System.out.println("test R T");
        int age = 10/0;
        return "D";
    }


    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) throws Exception{
        int age = 10/0;
        return "testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException ex){
        return ".....太快了......";
    }
}
