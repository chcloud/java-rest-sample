package com.changhong.cloud.javarestsample.pojo;

/**
 * 描述:实体类
 * 时间:2018-03-06 8:22
 *
 * @author:yjph83
 */
public class User {
    private int id;
    private String name;
    private int age;
    private Short status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
