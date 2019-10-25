package com.sucl.sc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sucl
 * @since 2019/9/18
 */
@EnableEurekaServer
@SpringBootApplication
public class EureakServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EureakServer2Application.class,args);
    }
}
