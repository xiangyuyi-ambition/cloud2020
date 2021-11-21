package com.atguigu.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-07 16:45
 **/
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class FeignHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixMain80.class, args);
    }
}
