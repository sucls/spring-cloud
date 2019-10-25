package com.sucl.eurekahello0.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author sucl
 * @since 2019/10/21
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * hystrix断路器
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "errorInvoke")
    public String hello(String name){
        return restTemplate.getForObject("http://HI/hi/"+name,String.class);
    }

    /**
     * 短路方法，注意参数要与源方法一致
     * @param name
     * @return
     */
    public String errorInvoke(String name){
        return "service err";
    }

}
