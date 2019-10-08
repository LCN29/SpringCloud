package com.can.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-08 10:37
 */
@RestController
public class PropertyController {

    @Resource
    private ApplicationContext applicationContext;

    @GetMapping("/property")
    public String property() {

        System.out.println(applicationContext);
        System.out.println(applicationContext.getParent());
        String resp = "收到请求";
        return resp;
    }

}
