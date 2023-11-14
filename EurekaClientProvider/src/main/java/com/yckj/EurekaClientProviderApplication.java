package com.yckj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname EurekaClientProviderApplication
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/10 9:25
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProviderApplication.class,args);
    }
}
