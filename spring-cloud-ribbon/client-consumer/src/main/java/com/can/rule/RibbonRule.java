package com.can.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;

/**
 * @description: 自定义负载规则
 * @author: LCN
 * @date: 2019-10-04 15:11
 */
public class RibbonRule extends AbstractLoadBalancerRule {

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
    }

    @Override
    public Server choose(Object o) {
        // 实现你的逻辑
        return null;
    }
}
