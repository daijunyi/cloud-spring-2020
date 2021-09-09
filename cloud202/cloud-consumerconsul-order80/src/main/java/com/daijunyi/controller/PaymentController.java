package com.daijunyi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    private static final String serverUrl = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentConsul(){
        String forObject = restTemplate.getForObject(serverUrl + "/payment/consul", String.class);
        return forObject;
    }

}
