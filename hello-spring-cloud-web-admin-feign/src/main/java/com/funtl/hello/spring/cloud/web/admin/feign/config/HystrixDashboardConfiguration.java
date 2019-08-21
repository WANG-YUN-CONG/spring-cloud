package com.funtl.hello.spring.cloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: hello-spring-cloud
 * @description: HystrixDashboardConfiguration
 * @author: wyc
 * @create: 2019-08-20 18:14
 */
//熔断器的监视器（仪表盘） 配置类
//1.浏览器端访问 http://localhost:8764/hystrix
//2.http://localhost:8765/hystrix.stream
//3.设置title
@Configuration
public class HystrixDashboardConfiguration {
    /*
        创建 hystrix.stream 的 Servlet 配置
        Spring Boot 2.x 版本开启 Hystrix Dashboard 与 Spring Boot 1.x 的方式略有不同，
        需要增加一个 HystrixMetricsStreamServlet 的配置，代码如下：
    */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        //设置地址   如：http://localhost:8764/hystrix.stream
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}