package com.cloud.eureka_client.controller;

import com.cloud.eureka_client.service.EurekaRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EurekaRibbonController {

    @Autowired
    private EurekaRibbonService eurekaRibbonService;

    @ResponseBody
    @GetMapping("/getRibbonService")
    public String getRibbonService(String type) {
        return eurekaRibbonService.sayHello() + "_" + type;
    }
}
