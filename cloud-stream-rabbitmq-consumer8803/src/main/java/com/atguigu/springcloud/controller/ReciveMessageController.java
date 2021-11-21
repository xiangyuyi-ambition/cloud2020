package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-09 14:35
 **/
@Component
@EnableBinding(Sink.class)
public class ReciveMessageController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println(message.getPayload() + " 消费者端口为serverPost: " + serverPort);
    }

}
