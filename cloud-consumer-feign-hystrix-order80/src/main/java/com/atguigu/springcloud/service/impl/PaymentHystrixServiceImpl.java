package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-07 18:46
 * 需要注意的是：
 *    hystrix处理的是openfeign调用PaymentHystrixService方法时发生的异常或延迟
 *    也即只处理调用的服务器的问题，自身的controller等需要重写fallback
 **/
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String payment_ok(Integer id) {
        return "PaymentHystrixService fall back payment_ok";
    }

    @Override
    public String payment_timeout(Integer id) {
        return "PaymentHystrixService fall back payment_timeout";
    }
}
