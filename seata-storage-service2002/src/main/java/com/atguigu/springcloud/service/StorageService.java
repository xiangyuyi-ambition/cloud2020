package com.atguigu.springcloud.service;

import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-11-20 18:36
 **/
public interface StorageService {

    void decrease(Long productId, Integer count);
}
