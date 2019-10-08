package com.can;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-06 11:12
 */
@EnableEurekaClient
@SpringBootApplication
public class GatewayService {
    
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("1");

        //SpringApplication.run(GatewayService.class, args);

    }
}
