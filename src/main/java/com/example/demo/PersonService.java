package com.example.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonService {

    private String name;// 姓名
    private int age;// 年龄
    private String sex = "man";// 性别，不配置的时候默认为 man

}
