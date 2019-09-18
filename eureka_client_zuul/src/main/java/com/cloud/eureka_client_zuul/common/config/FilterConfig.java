package com.cloud.eureka_client_zuul.common.config;


import com.cloud.eureka_client_zuul.common.filter.TestZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {
    @Bean
    public TestZuulFilter getZuulFilter() {
        return new TestZuulFilter();
    }
}
