package com.daijunyi.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class FlowLimitService {

    @SentinelResource(value = "flowLimit")
    public String flowLimit(){
        return "flowLimit";
    }
}
