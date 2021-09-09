package com.daijunyi.controller;

import com.daijunyi.service.IMessageProvider;
import com.daijunyi.service.impl.ImessageProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider imessageProvider;

    @GetMapping("/send/message")
    public String sendMessage(){
        String send = imessageProvider.send();
        return send;
    }

}
