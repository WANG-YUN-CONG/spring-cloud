package com.funtl.hello.spring.cloud.web.admin.feign.service;

import com.funtl.hello.spring.cloud.web.admin.feign.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: hello-spring-cloud
 * @description: AdminService
 * @author: wyc
 * @create: 2019-08-20 17:33
 */
//通过 @FeignClient("服务名") 注解来指定调用哪个服务。代码如下：
@FeignClient(value = "hello-spring-cloud-service-admin",
        //熔断器类
        fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}