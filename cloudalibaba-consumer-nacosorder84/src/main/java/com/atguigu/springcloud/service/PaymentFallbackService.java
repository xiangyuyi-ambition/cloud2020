package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-02-25 18:30
 *需要注意的是：
 *    sentinel处理的是opengfeifn调用PaymentService的方法的异常
 *    也即只处理调用的服务器的问题，自身的controller等需要重写fallback
 *    修改9003的paymentSQL，抛出异常，则会调用兜底
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "Feign服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
