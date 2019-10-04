package com.can.controller;

import com.can.provider.ProviderRemote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 13:48
 */
@RestController
public class RibbonController {

    @Resource
    private ProviderRemote providerRemote;

    @GetMapping("/ribbon")
    public String ribbon() {
        String resp = providerRemote.ribbon();
        return resp;
    }
}
