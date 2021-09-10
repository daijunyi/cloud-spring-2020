package com.daijunyi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.daijunyi.dao"})
public class MyBatisConfig {
}
