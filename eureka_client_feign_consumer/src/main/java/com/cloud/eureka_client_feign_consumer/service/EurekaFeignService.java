package com.cloud.eureka_client_feign_consumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ribbon-provider")
public interface EurekaFeignService {

    @RequestMapping(value = "/getRibbonService?type=provider", method = RequestMethod.GET)
    public String sayHello();
}
