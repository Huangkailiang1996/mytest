package com.huang.mytest.mapper;

import com.huang.mytest.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DynamicSqlMapper {
    /**
     * 动态sql的实现
     */
    List<Student> queryByCondition(Student student);

    /**
     * 传入数组批量查询
     */
    List<Student> queryByArrays(@Param("ids") Integer[] ids);

    /**
     * 通过list集合时间批量插入
     */
    int insertByList(@Param("students")List<Student> students);
}
