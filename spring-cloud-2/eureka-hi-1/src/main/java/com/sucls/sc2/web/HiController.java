package com.sucls.sc2.web;

import com.sucls.sc2.service.HiService;
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
@RestController
@RequestMapping("/hi")
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping("/{name}")
    public String hi(@PathVariable String name, HttpServletRequest request){
        return hiService.hi(name) + ",at port:"+request.getLocalPort();
    }
}
