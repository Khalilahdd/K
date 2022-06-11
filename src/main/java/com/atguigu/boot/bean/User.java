package com.atguigu.boot.bean;

import lombok.*;

/**
 * 用户
 */
@Data
@ToString
//@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
