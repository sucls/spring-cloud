package com.sucl.eurekaapp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableEurekaClient
//@EnableDiscoveryClient
@SpringBootApplication
public class EurekaApp3Application {

    @Value("${server.port}")
    private String port;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name){
        return "hi "+name +". at port: "+port;
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return restTemplate.getForObject("http://app/hello?name="+name,String.class);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public AlwaysSampler defaultSampler(){
//        return new AlwaysSampler();
//    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaApp3Application.class, args);
    }

}
