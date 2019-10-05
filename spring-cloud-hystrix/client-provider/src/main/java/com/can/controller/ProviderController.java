package com.can.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 13:18
 */
@RestController
public class ProviderController {

    @GetMapping("/hello/{delay}")
    public String hello(@PathVariable("delay")int delay, HttpServletRequest request) {
        // 传递的参数为1, 让线程睡5s, 让调用方超时
        if (delay == 1) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //打印请求的地址
        String resp = " 当前响应来自于" + request.getRequestURL();
        return resp;
    }
}
