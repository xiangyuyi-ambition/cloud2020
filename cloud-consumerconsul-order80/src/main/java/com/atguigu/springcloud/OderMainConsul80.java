package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-06 18:27
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OderMainConsul80 {
    public static void main(String[] args){
        SpringApplication.run(OderMainConsul80.class, args);
    }
}
