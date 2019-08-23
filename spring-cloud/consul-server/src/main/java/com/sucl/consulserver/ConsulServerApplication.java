package com.sucl.consulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ConsulServerApplication {

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name){
        return "hi "+name;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsulServerApplication.class, args);
    }

}
