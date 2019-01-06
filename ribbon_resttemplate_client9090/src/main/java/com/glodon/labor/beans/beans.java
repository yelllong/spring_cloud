package com.glodon.labor.beans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * \* 2018/12/31 21:19
 * \* Description:
 * \
 */
@Configuration
public class beans {
    @Bean
    @LoadBalanced // 作用：1.解决服务的负载均衡问题，2.解决(UnknownHostException)异常问题
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

