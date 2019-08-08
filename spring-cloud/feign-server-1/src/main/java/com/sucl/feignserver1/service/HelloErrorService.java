package com.sucl.feignserver1.service;

import org.springframework.stereotype.Service;

/**
 * @author sucl
 * @since 2019/8/7
 */
@Service
public class HelloErrorService implements HelloService{

    @Override
    public String hello(String name) {
        return "invoke service error.";
    }
}
