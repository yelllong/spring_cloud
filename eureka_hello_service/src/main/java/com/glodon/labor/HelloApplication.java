package com.glodon.labor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * \* 2018/12/30 21:29
 * \* Description:
 * \
 */
@SpringBootApplication
@EnableEurekaClient // 这个只适用于eureka的注册中心
//@EnableDiscoveryClient // 适用于任意注册中心
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}

