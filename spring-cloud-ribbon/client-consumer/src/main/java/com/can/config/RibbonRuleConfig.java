package com.can.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 15:26
 */
public class RibbonRuleConfig {
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
