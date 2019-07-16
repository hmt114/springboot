package com.lanou3g.springboot.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author hmt
 * @date 2019/7/15 10:41
 */
@Getter
@Setter
public class Student implements Serializable {
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
