package com.example.jwt.config;

import com.example.jwt.filter.MyFilter1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter1> filter() {
        FilterRegistrationBean<MyFilter1> bean = new FilterRegistrationBean<>(new MyFilter1());
        bean.addUrlPatterns("/*");
        bean.setOrder(0); // 필터 우선 순위
        return bean;
    }

}
