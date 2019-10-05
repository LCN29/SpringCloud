package com.can.controller;

import com.can.provider.ProviderRemote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 13:48
 */
@RestController
public class HystrixController {

    @Resource
    private ProviderRemote providerRemote;

    @GetMapping("/hystrix/{delay}")
    public String hystrix(@PathVariable("delay")int delay) {
        String resp = providerRemote.hystrix(delay);
        return resp;
    }
}
