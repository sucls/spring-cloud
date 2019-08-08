package com.sucl.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(EurekaServerApplication.class).properties(
//                "spring.config.name:eureka", "logging.level.com.netflix.discovery:OFF")
//                .run(args);
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
