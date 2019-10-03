package com.can.controller;

import com.can.remote.RemoteServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-03 20:03
 */

@RestController
public class FeignController {

    @Resource
    private RemoteServer remoteServer;

    @GetMapping("/feign/{id}")
    public String feign(@PathVariable("id") int id) {
        String result = remoteServer.server(id);
        return result;
    }
}
