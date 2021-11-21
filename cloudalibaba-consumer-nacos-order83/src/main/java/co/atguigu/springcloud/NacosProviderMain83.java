package co.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-10 12:32
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderMain83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderMain83.class, args);
    }
}
