package com.cloud.eureka_client.service;

import org.springframework.stereotype.Service;

@Service
public class EurekaRibbonService {

    public String sayHello() {
        return "helloWorld";
    }
}