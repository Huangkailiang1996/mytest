package com.huang.mytest.service;

import com.huang.mytest.mapper.DynamicSqlMapper;
import com.huang.mytest.mapper.UserMapper;
import com.huang.mytest.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
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

    @Override
    public int updateAge(Integer age, Integer id) {
        dynamicSqlMapper.updateAgeAdd(age, id);
        dynamicSqlMapper.updateAgeMin(age, id);
        return 0;
    }
}
