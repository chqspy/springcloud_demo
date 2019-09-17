package com.cloud.eureka_client_feign_consumer.controller;

import com.cloud.eureka_client_feign_consumer.service.EurekaFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EurekaFeignController {

    @Autowired
    private EurekaFeignService eurekaFeignService;

    @ResponseBody
    @GetMapping("/getRibbonService")
    public String getRibbonService(String type) {
        return eurekaFeignService.sayHello() + "_" + type;
    }
}
