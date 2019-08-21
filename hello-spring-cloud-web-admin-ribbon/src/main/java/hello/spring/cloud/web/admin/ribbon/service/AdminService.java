package hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: hello-spring-cloud
 * @description: AdminService
 * @author: wyc
 * @create: 2019-08-20 16:38
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    //熔断注解，服务调用失败以后 回调错误方法
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class);
    }
    // 回调此熔断方法
    public String hiError(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}