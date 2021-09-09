package com.daijunyi.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceFallback implements PaymentService {

    private final String warnString = "服务器忙";

    @Override
    public String paymentInfo_OK(Integer id) {
        return warnString;
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return warnString;
    }
}
