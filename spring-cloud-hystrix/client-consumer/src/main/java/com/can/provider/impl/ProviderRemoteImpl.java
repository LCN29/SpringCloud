package com.can.provider.impl;

import com.can.provider.ProviderRemote;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-05 14:30
 */
@Component
public class ProviderRemoteImpl implements ProviderRemote {

    @Override
    public String hystrix(int delay) {
        return "服务提供方出现异常, 不进行调用直接返回了";
    }
}
