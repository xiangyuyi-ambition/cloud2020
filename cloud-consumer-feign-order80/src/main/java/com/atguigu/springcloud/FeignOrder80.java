package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-07 12:38
 **/
@SpringBootApplication
@EnableFeignClients
public class FeignOrder80 {
    public static void main(String[] args){
        SpringApplication.run(FeignOrder80.class, args);
    }
}
