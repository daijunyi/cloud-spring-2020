package com.daijunyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway9527.class,args);
    }
}
