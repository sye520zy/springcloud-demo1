package com.yckj.feign;

import com.yckj.entities.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Classname IFeignService
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/10 14:32
 */
@FeignClient(value = "provider") // fallback服务降级
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public List<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
