package com.yckj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Classname ZuulApplication
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/10 11:34
 */
@EnableZuulProxy // 包含了 @EnableZuulServer ，设置该类是⽹关的启动类。
@EnableAutoConfiguration // 可以帮助Spring Boot应⽤将所有符合条件的@Configuration配置加载到当前Spring Boot创建并使⽤的IOC容器中。
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
