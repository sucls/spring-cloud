package com.sucls.sc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sucl
 * @since 2019/9/23
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaHi1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHi1Application.class,args);
    }
}
