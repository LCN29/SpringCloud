package com.can.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 09:56
 */
@RestController
public class MetaDataController {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/meta")
    public String metaDate() {

        List<ServiceInstance> list =  discoveryClient.getInstances("eureka-client-one");
        String result = "";
        for (ServiceInstance instance : list) {
            Map<String, String> map = instance.getMetadata();
            for(Map.Entry<String, String> entry : map.entrySet()) {
                result += entry.getKey() + ":" + entry.getValue() + "\n";
            }
        }
        return result;
    }
}
