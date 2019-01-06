package com.glodon.labor.controller;

import com.glodon.labor.clientsIntefaces.FeignServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* 2019/1/1 11:19
 * \* Description:
 * \
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    private FeignServiceInterface feignServiceInterface;
    @RequestMapping("sendFeign")
    public String sendFeign(String name) {
        String sayHello = feignServiceInterface.sayHello(name);
        return sayHello;
    }
}

