package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-11-20 16:52
 **/
@Mapper
public interface OrderDao {

    /**
     *
     * @param order
     */
    void createOrder(Order order);


    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
