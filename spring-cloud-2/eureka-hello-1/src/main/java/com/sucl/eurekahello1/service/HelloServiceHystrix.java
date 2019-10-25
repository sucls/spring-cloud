package com.sucl.eurekahello1.service;

import org.springframework.stereotype.Component;

/**
 *  HelloService短路服务
 *  需要实现其接口
 * @author sucl
 * @since 2019/10/22
 */
@Component
public class HelloServiceHystrix implements HelloService{

    @Override
    public String hello(String name) {
        return "service invoke error.";
    }
}
