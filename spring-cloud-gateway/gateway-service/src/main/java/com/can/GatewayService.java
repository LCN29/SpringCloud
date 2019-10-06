package com.can;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-06 11:12
 */
@EnableEurekaClient
@SpringBootApplication
public class GatewayService {
    
    public static void main(String[] args) {
        SpringApplication.run(GatewayService.class, args);
    }
}
