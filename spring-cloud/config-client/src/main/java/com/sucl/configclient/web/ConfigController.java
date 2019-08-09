package com.sucl.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sucl
 * @since 2019/8/9
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${config.name}")
    private String configName;

    @GetMapping
    public String config(){
        return configName;
    }

}
