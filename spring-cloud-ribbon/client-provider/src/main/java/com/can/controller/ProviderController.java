package com.can.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 13:18
 */
@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        //request.getC
        String resp = " 当前响应来自于" + request.getRequestURL();
        return resp;
    }

}
