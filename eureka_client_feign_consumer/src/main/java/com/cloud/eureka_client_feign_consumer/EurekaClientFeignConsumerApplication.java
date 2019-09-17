package com.cloud.eureka_client_feign_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan
@EnableFeignClients
public class EurekaClientFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientFeignConsumerApplication.class, args);
    }

}
