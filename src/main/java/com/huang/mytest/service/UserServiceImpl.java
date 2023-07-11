package com.huang.mytest.service;

import com.huang.mytest.mapper.UserMapper;
import com.huang.mytest.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Student selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
