package com.huang.mytest.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
@WebFilter(urlPatterns = "/a",filterName = "testFilter")
public class MyTwoFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("用注解配置的过滤器启动过滤器");
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("用注解配置的过滤器放行");
    }
}
