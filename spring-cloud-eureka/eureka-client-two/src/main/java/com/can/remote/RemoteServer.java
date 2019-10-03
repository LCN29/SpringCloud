package com.can.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-03 20:00
 */
@FeignClient(name = "eureka-client-one")
public interface RemoteServer {

    @GetMapping("/server/{id}")
    String server(@PathVariable("id") int id);

}
