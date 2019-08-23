package com.sucl.eurekaserver0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer0Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer0Application.class, args);
    }

}
