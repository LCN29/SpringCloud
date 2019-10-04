package com.can.client;

import com.can.config.RibbonRuleConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 15:28
 */
@RibbonClient(name = "client-provider", configuration = RibbonRuleConfig.class)
public class MyRibbonClient {
}
