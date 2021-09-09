package com.daijunyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZkMainApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerZkMainApplication80.class,args);
    }
}
