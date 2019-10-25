package com.sucl.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * @author sucl
 * @since 2019/10/24
 */
public class RoutingZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "routing";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
