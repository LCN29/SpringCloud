package com.can.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-06 13:46
 */
@RestController
public class SecondController {

    @GetMapping("/second/{num}")
    public String sencond(@PathVariable("num")int num) {
        String resp = "第二个服务," + num;
        return resp;
    }
}
