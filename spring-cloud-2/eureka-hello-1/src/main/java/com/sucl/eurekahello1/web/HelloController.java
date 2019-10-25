package com.sucl.eurekahello1.web;

import com.sucl.eurekahello1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sucl
 * @since 2019/10/21
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/{name}")
    public String hello(@PathVariable String name){
        return helloService.hello(name);
    }
}
