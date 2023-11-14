package com.yckj.feign;

import com.yckj.entities.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Classname FeignError
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/10 14:43
 */
@Component
public class FeignError implements IFeignService {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
