package com.can.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-08 11:03
 */
@RefreshScope
@RestController
public class PropertyController {

    @Value("${my.name}")
    private String name;

    @GetMapping("/property")
    public String getProperty() {
        String resp = "从远程获取到的配置" + name;
        return resp;
    }
}
