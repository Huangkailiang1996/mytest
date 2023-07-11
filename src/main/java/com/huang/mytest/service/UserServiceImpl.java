package com.huang.mytest.service;

import com.huang.mytest.mapper.DynamicSqlMapper;
import com.huang.mytest.mapper.UserMapper;
import com.huang.mytest.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DynamicSqlMapper dynamicSqlMapper;

    @Override
    public Student selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<Student> queryByCondition(Student student) {
        return dynamicSqlMapper.queryByCondition(student);
    }

    @Override
    public List<Student> queryByArrays(Integer[] ids) {
        return dynamicSqlMapper.queryByArrays(ids);
    }

    @Override
    public int insertByList(List<Student> students) {
        return dynamicSqlMapper.insertByList(students);
    }
}
