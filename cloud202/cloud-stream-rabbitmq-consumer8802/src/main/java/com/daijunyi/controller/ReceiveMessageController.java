package com.daijunyi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

@EnableBinding(Sink.class)
@Slf4j
public class ReceiveMessageController {

    @StreamListener(Sink.INPUT)
    public void receverMessage(Message<String> message){
        String payload = message.getPayload();
        log.info("接受信息："+payload);
    }

}
