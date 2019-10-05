package com.can;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @description:
 * @author: LCN
 * @date: 2019-10-05 18:11
 */
@SpringBootApplication
@EnableHystrixDashboard
public class MonitorDashBoard {
    public static void main(String[] args) {
        SpringApplication.run(MonitorDashBoard.class, args);
    }
}
