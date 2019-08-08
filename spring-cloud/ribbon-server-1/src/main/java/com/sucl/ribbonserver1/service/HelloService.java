package com.sucl.ribbonserver1.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author sucl
 * @since 2019/8/6
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorHello")
    public String hello(String name){
        return restTemplate.getForObject("http://app/hello?name="+name,String.class);
    }

    public String errorHello(String name){
        return "error invoke service hello";
    }

}
