package com.sucl.sc2.service.impl;

import com.sucl.sc2.service.HiService;
import org.springframework.stereotype.Service;

/**
 * @author sucl
 * @since 2019/9/23
 */
@Service
public class HiServiceImpl implements HiService {

    @Override
    public String hi(String name) {
        return "hi ".concat(name);
    }
}
