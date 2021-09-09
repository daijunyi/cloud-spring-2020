package com.daijunyi.config;

import com.daijunyi.lb.RoundRobinLB;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public RoundRobinLB roundRobinLB(){
        return new RoundRobinLB();
    }
}
