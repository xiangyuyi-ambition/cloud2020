package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-11-20 17:22
 **/
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name="fsp_create_order")
    public void createOrder(Order order) {
        log.info("---开始创建订单---");
        orderDao.createOrder(order);

        log.info("---- 调用库存服务,扣除库存-----");
        storageService.decrease(order.getProductId(), order.getCount());

        log.info("---- 调用账户服务,扣除账户金额-----");
        accountService.decrease(order.getUserId(), order.getMoney());

        log.info("---- 修改订单状态-----");
        orderDao.update(order.getUserId(), 0);

        log.info("success");
    }
}
