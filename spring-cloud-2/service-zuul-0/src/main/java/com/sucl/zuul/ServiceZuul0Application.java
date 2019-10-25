package com.sucl.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sucl
 * @since 2019/9/23
 */
@RestController
@RequestMapping("/local")
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceZuul0Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuul0Application.class,args);
    }

    @GetMapping("/info")
    public String info(){
        return "zuul";
    }
}
