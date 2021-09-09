package com.daijunyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsulMainApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulMainApplication80.class,args);
    }
}
