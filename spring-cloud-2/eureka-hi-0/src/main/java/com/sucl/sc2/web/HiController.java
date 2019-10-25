package com.sucl.sc2.web;

import com.sucl.sc2.service.HiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sucl
 * @since 2019/9/23
 */
@Slf4j
@RestController
@RequestMapping("/hi")
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping("/{name}")
    public String hi(@PathVariable String name, HttpServletRequest request){
        log.info("local port: {}",request.getLocalPort());
        log.info("remote port: {}",request.getRemotePort());
        log.info("server port: {}",request.getServerPort());

        return hiService.hi(name) + ",at port:"+request.getLocalPort();
    }
}
