package com.changhong.cloud.javarestsample.service;

import com.changhong.cloud.javarestsample.dao.UserDao;
import com.changhong.cloud.javarestsample.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述:
 * 时间:2018-03-06 13:00
 *
 * @author:yjph83
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> listUser() {
        return userDao.listUser();
    }

    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    /**
     * 单表可不要这个注解，多表事务自己完善
     * @param user
     */
    @Transactional
    public void saveUser(User user){
        userDao.add(user);
    }
}
