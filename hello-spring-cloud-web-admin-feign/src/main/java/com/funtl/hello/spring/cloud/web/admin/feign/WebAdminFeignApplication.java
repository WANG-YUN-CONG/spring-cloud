package com.funtl.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: hello-spring-cloud
 * @description: WebAdminFeignApplication
 * @author: wyc
 * @create: 2019-08-20 17:30
 */
@SpringBootApplication
//通过 @EnableDiscoveryClient 注解注册到服务中心，去发现服务提供者
@EnableDiscoveryClient
//通过 @EnableFeignClients 注解开启 Feign 功能
@EnableFeignClients
//熔断监视器（仪表盘）（断路器）注解
@EnableHystrixDashboard

public class WebAdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class, args);
    }
}