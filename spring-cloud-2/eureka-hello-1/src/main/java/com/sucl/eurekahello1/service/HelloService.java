package com.sucl.eurekahello1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sucl
 * @since 2019/10/21
 */
@FeignClient(value = "HI",fallback = HelloServiceHystrix.class)
public interface HelloService {

    /**
     * 注意这里是目标服务地址
     * @param name
     * @return
     */
    @GetMapping("/hi/{name}")
    String hello(@PathVariable("name") String name);
}
