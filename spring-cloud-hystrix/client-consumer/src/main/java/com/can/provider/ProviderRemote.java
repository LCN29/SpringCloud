package com.can.provider;

import com.can.provider.impl.ProviderRemoteImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 14:00
 */
@FeignClient(name = "client-provider", fallback = ProviderRemoteImpl.class)
public interface ProviderRemote {

    /**
     * 远程接口
     * @param delay 是否进入延迟 1：开启
     * @return
     */
    @GetMapping("/hello/{delay}")
    String hystrix(@PathVariable("delay")int delay);
}
