package com.huang.mytest.service;

import com.huang.mytest.pojo.Student;

import java.util.List;

public interface UserService {

    Student selectById(Integer id);

    List<Student> queryByCondition(Student student);

    List<Student> queryByArrays(Integer[] ids);

    int insertByList(List<Student> students);

    int updateAge(Integer age, Integer id);

}
