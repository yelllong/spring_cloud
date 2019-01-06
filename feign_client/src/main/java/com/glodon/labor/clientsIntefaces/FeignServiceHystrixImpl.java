package com.glodon.labor.clientsIntefaces;

import org.springframework.stereotype.Component;

/**
 * \* 2019/1/1 13:08
 * \* Description:
 * \
 */
@Component
public class FeignServiceHystrixImpl implements FeignServiceInterface {
    @Override
    public String sayHello(String name) {
        return "嗨！休息会儿吧，我正在处理中... 谢谢："+name;
    }
}

