package com.glodon.labor.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * \* 2018/12/31 19:40
 * \* Description:
 * \
 */
@RestController
@RequestMapping("/hi")
@DefaultProperties(defaultFallback = "defaultError")
public class HiController {
    @Autowired
    private  RestTemplate restTemplate;
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/sayHi")
    @HystrixCommand(fallbackMethod = "errorHi")
    public String sayHi(String name) {
        // 第一种方式调用
//        RestTemplate restTemplate = new RestTemplate();
//        String forObject = restTemplate.getForObject("http://localhost:8989/hello/sayHello?name="+name, String.class);
//        System.out.println(forObject);

        // 第二种方式调用
//        ServiceInstance instance = loadBalancerClient.choose("HELLO-SERVICE");
//        System.out.println(instance.getHost()+":"+instance.getPort());
//        System.out.println(instance.getUri());
//        RestTemplate restTemplate = new RestTemplate();
//        String forObject = restTemplate.getForObject("http://" + instance.getHost() + ":" + instance.getPort() + "/hello/sayHello?name=" + name, String.class);

        // 第三种方式调用
        String forObject = restTemplate.getForObject("http://hello-service/hello/sayHello?name=" + name, String.class);
        return forObject;
    }

    public String errorHi(String name) {
        return "服务繁忙，请稍后访问。谢谢："+name;
    }

    public String defaultError(String name) {
        return "服务繁忙，请稍后访问。谢谢："+name;
    }
}

