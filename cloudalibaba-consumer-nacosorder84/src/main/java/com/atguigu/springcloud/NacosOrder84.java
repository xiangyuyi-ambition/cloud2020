package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-11-19 18:53
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosOrder84 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrder84.class, args);
    }
}
