package com.daijunyi;

import com.myrule.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = {RuleConfig.class})
public class MainConsumerOrderAppliction80 {

    public static void main(String[] args) {
        SpringApplication.run(MainConsumerOrderAppliction80.class);
    }
}
