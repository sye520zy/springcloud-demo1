package com.yckj.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yckj.entities.Student;
import com.yckj.mapper.StudentMapper;
import com.yckj.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 * @Classname StudentServiceImpl
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/10 9:47
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
}
