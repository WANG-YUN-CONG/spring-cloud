package hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program: hello-spring-cloud
 * @description: WebAdminRibbonApplication
 * @author: wyc
 * @create: 2019-08-20 16:32
 */
@SpringBootApplication
//通过 @EnableDiscoveryClient 注解注册到服务中心，去发现服务提供者
@EnableDiscoveryClient
//熔断器注解
@EnableHystrix

public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class,args);
    }
}