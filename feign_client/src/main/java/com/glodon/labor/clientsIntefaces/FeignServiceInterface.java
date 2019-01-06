package com.glodon.labor.clientsIntefaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * \* 2019/1/1 11:21
 * \* Description:
 * \
 */
@FeignClient(value = "HELLO-SERVICE", fallback = FeignServiceHystrixImpl.class)
public interface FeignServiceInterface {
    @RequestMapping("/hello/sayHello")
    String sayHello(@RequestParam("name") String name);
}

