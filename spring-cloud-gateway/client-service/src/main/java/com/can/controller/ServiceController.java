package com.can.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-06 10:10
 */
@RestController
public class ServiceController {

    @GetMapping("/server/{num}")
    public String service(@PathVariable("num")int num) {
        String resp = "服务提供端收到了消息:" + num;
        System.out.println("服务提供者进行了服务");
        return resp;
    }
}
