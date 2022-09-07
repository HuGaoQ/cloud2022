package com.ncamc.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: hugaoqiang
 * @CreateTime: 2022-09-01 10:25
 */
@SpringBootApplication
@MapperScan("com.ncamc.springcloud.mapper")
@EnableEurekaClient
public class PaymentMain8001
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}