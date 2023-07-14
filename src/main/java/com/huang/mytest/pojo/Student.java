package com.huang.mytest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Component
//@ConfigurationProperties(prefix = "student")
//@PropertySource("classpath:mytest.properties")
//@PropertySources({@PropertySource("classpath:mytest.properties")})
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
