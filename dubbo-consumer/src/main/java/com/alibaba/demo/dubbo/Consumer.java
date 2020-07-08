package com.alibaba.demo.dubbo;

import com.alibaba.dubbo.demo.DemoService;
import com.alibaba.dubbo.demo.MqSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author: YuanGuiyu
 * @Date: 2019/6/6/006 14:35
 * @Version 1.0
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        MqSendService mqSendService = context.getBean(MqSendService.class);
        System.out.println("consumer");
        System.out.println(mqSendService.callback(1L));
    }
}