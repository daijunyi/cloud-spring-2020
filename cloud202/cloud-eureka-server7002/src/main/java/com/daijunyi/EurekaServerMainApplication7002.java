package com.daijunyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMainApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMainApplication7002.class,args);
    }
}
