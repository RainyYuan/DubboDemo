package com.alibaba.controller;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.demo.MqSendService;
import com.alibaba.mq.Producer;
import mq.JmsConfig;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.logging.inner.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

//@Service(version="1.0",group="SendMqMessageService",timeout = 5000)
public class SendMqMessageService implements MqSendService {
    Logger logger = Logger.getLogger(SendMqMessageService.class);
    @Autowired
    private Producer producer;

    private List<String> mesList;



    public SendMqMessageService() {
        mesList = new ArrayList<String>();
        mesList.add("小小");
        mesList.add("爸爸");
        mesList.add("妈妈");
        mesList.add("爷爷");
        mesList.add("奶奶");

    }

    public Object callback(Long id)  {
        try{
            //总共发送五次消息
            for (String s : mesList) {
                //创建生产信息
                Message message = new Message(JmsConfig.TOPIC, "testtag", ("小小一家人的称谓:" + s).getBytes());
                //发送
                SendResult sendResult = producer.getProducer().send(message);
                System.out.println("输出生产者信息="+sendResult);

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return "成功";
    }

}
