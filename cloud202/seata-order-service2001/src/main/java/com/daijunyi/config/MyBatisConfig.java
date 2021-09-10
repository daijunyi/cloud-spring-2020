package com.daijunyi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.daijunyi.dao"})
public class MyBatisConfig {
}
