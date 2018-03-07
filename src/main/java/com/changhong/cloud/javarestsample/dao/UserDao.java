package com.changhong.cloud.javarestsample.dao;

import com.changhong.cloud.javarestsample.pojo.User;

import java.util.List;


/**
 * 描述:
 * 时间:2018-03-06 9:27
 *
 * @author:yjph83
 */
public interface UserDao {

    List<User> listUser();

    User getUserById(Integer id);

    void add(User user);
}
