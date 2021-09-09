package com.daijunyi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    private String serverUrl = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentzk(){
        String forObject = restTemplate.getForObject(serverUrl + "/payment/zk", String.class);
        return forObject;
    }
}
