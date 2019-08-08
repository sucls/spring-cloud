package com.sucl.zuulserver1.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author sucl
 * @since 2019/8/8
 */
@Slf4j
@Component
public class AuthorizationFilter extends ZuulFilter {

    /**
     * 定义过滤时机
     *  "pre" for pre-routing filtering,
     *  "route" for routing to an origin,
     *  "post" for post-routing filters,
     *  "error" for error handling.
     *  "static" for static responses see  StaticResponseFilter
     *  "<*>" for any FilterProcessor.runFilters(type)
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 可以定制过滤条件
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 定义过滤具体逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        log.info(">>>>>>>>> invoke service {} of method {}",request.getRequestURI(),request.getMethod());
        String token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            log.error("user token is null,invoke failure.");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            try {
                currentContext.getResponse().getWriter().write(HttpStatus.UNAUTHORIZED.getReasonPhrase());
            } catch (IOException e) {
                log.error("",e);
            }
        }
        log.info(">>>>>>>>> service {} invoke successfully",request.getRequestURI(),request.getMethod());
        return null;
    }
}
