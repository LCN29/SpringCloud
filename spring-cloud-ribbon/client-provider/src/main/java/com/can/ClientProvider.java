package com.can;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-04 13:17
 */
@EnableEurekaClient
@SpringBootApplication
public class ClientProvider {

    /**
     * idea 右上角的 Edit configurations, 右边有个 Program arguments 就能配置启动参数
     * 启动是 在启动参数里面配置 --spring.profiles.active=9092 / --spring.profiles.active=9091
     * 就能启动2个提供者，达到集群效果
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ClientProvider.class, args);
    }
}
