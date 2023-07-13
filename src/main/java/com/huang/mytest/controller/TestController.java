package com.huang.mytest.controller;


import com.huang.mytest.pojo.Student;
import com.huang.mytest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @Transactional
    @GetMapping("/b")
    public void test1() {
        Integer[] arr = {1, 2, 4};
        List<Student> studentList = userService.queryByArrays(arr);
        for (Student s : studentList) {
            log.info("查询出学生姓名为：{}", s.getName());
        }
    }

    @GetMapping("/c")
    public void test2() {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(null, "时旺", 28, "男"));
        arrayList.add(new Student(null, "赵日天", 48, "男"));
        arrayList.add(new Student(null, "柳如玉", 88, "女"));
        arrayList.add(new Student(null, "王大胖", 29, "男"));
        arrayList.add(new Student(null, "赵飞燕", 8, "女"));
        int i = userService.insertByList(arrayList);
        log.info("批量插入结束");
    }

    @GetMapping("/tran")
    public void test3() {
        int updateAge = userService.updateAge(100, 1);
        log.info("修改成功：{}",updateAge);
    }
}
