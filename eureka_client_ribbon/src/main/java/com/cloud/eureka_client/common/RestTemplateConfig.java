package com.cloud.eureka_client.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestTemplateConfig {
    @Bean
    @Autowired
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
