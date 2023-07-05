package com.huang.mytest.filter;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
public class WebVisitFilterConfig {

    @Bean
    public FilterRegistrationBean<Filter> webVisitFilterConfigRegistration() {
        //匹配拦截 URL
        String urlPatterns = "/a,/s";
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setDispatcherTypes(DispatcherType.REQUEST);
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns(StringUtils.split(urlPatterns, ","));
        //设置名称
        registration.setName("webVisitFilter");
        //设置过滤器链执行顺序
        registration.setOrder(3);
        //启动标识
        registration.setEnabled(true);
        //添加初始化参数
        registration.addInitParameter("enabel", "true");
        return registration;
    }
}
