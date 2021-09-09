package com.daijunyi.service.openfeign;

import com.daijunyi.entities.CommonResult;
import com.daijunyi.entities.Payment;
import com.daijunyi.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(4444,"服务器忙，请稍后再试");
    }

}
