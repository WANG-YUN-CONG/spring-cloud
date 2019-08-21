package com.funtl.hello.spring.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: hello-spring-cloud
 * @description: com.funtl.hello.spring.cloud.zuul.ZuulApplication
 * @author: wyc
 * @create: 2019-08-20 18:55
 */
@SpringBootApplication
@EnableEurekaClient
//开启网关注解
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}