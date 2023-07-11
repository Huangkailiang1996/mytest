package com.huang.mytest.mapper;

import com.huang.mytest.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    Student selectById(@Param("id") Integer id);
}
