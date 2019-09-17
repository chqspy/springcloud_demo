package com.cloud.eureka_client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EurekaRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHello() {
        return restTemplate.getForObject("http://ribbon-provider/getRibbonService?type=provider", String.class);
    }

}
