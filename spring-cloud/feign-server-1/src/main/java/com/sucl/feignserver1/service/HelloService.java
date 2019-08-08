package com.sucl.feignserver1.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 注意，这里的app是调用的服务对应spring.application.name
 * 下面的/hello是其暴露的接口，参数与返回都需要一致
 * 相当于通过 http://app/hello?name=xxx
 * @author sucl
 * @since 2019/8/6
 */
@FeignClient(value="app",fallback = HelloErrorService.class)
public interface HelloService {

    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name);
}
