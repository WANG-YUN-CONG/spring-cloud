package hello.spring.cloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: hello-spring-cloud
 * @description: RestTemplateConfiguration
 * @author: wyc
 * @create: 2019-08-20 16:39
 */
//配置注入 RestTemplate的 Bean，
// 并通过 @LoadBalanced 注解表明开启负载均衡功能
@Configuration  //配置类 xml
public class RestTemplateConfiguration {
    @Bean //创建一个BEAN
    @LoadBalanced
         // 指定class位置
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}