package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-11-19 13:25
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Service8401 {
    public static void main(String[] args) {
        SpringApplication.run(Service8401.class, args);
    }
}
