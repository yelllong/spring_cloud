package com.glodon.labor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* 2018/12/30 21:33
 * \* Description:
 * \
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("sayHello")
    private String sayHello(String name) {
        System.out.println("name:"+name);
        return "sayHello:" + name;
    }
}

