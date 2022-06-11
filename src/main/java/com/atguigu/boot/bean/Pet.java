package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 宠物
 */
@Data
@ToString
@AllArgsConstructor //无参构造器
@NoArgsConstructor  //全参构造器
public class Pet {

    private String name;


}
