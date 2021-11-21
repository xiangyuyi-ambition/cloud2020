package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-08 13:10
 **/
@Configuration
public class GateWayConfig {

    /**
     * 配置了命名为path_route_guonei的路由
     * 当访问地址为http://localhost:9527/guonei 时自动转发到：http://news.baidu.com/guonei
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route_guonei", r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
    }

}
