package com.can.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 14:00
 */
@FeignClient(name = "client-provider")
public interface ProviderRemote {

    /**
     * 远程接口
     * @return
     */
    @GetMapping("/hello")
    String ribbon();
}
