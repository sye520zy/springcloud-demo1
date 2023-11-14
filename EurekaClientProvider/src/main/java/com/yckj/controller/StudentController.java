package com.yckj.controller;

import com.yckj.entities.Student;
import com.yckj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname StudentController
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/10 10:11
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @Value("${server.port}")
    private String port;
    /**
     * 查询所有学生信息
     * @return
     */
    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.list();
    }

    /**
     * 根据ID查询学生信息
     * @param id
     * @return
     */
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentService.getById(id);
    }

    /**
     * 添加保存用户信息
     * @param student
     * @return
     */
    @PostMapping("/save")
    public boolean save(@RequestBody Student student){
        return studentService.save(student);
    }

    /**
     * 修改用户信息
     * @param student
     * @return
     */
    @PutMapping("/modify")
    public boolean modify(@RequestBody Student student){
        return studentService.updateById(student);
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @DeleteMapping("/removeById/{id}")
    public boolean removeById(@PathVariable Long id){
        return studentService.removeById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "返回当前端口："+this.port;
    }
}
