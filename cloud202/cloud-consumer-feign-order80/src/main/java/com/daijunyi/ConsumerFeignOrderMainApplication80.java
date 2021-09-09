package com.daijunyi;

import com.myrule.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = RuleConfig.class)
public class ConsumerFeignOrderMainApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignOrderMainApplication80.class,args);
    }
}
