package com.huang.mytest.controller;


import com.huang.mytest.pojo.Student;
import com.huang.mytest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/a")
    public void test() {
        Student student = new Student();
        student.setId(1);
        log.info("开始执行查询方法，条件id为:{}", student.getId());
        Student studenta = userService.selectById(student.getId());
        log.info("查询出学生姓名为：{}", studenta.getName());
    }
}
