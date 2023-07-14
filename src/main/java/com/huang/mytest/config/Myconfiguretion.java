package com.huang.mytest.config;

import com.huang.mytest.pojo.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Student.class})
public class Myconfiguretion {
}
