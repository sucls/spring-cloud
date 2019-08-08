package com.sucl.eurekaapp1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
//@EnableDiscoveryClient
@SpringBootApplication
public class EurekaApp1Application {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "hello "+name +". at port: "+port;
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaApp1Application.class, args);
    }

}
