package com.can.route;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 自定义路由规则
 * @author: LCN
 * @date: 2019-10-06 13:51
 */
@Configuration
public class RouteConfigruation {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        /**
         * 配置了一个 id 为 second_route, 访问 /second/* 会被重定向到 http://localhost:9091/second/*
         */
        return builder.routes()
                .route("second_route", r -> r.path("/second/*").uri("http://localhost:9091/second/*"))
                .build();
    }
}
