package com.funtl.hello.spring.cloud.web.admin.feign.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @program: hello-spring-cloud
 * @description: AdminServiceHystrix
 * @author: wyc
 * @create: 2019-08-20 18:05
 */
@Component  //交给spring容器管理
//创建熔断器类并实现对应的 Feign 接口
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}