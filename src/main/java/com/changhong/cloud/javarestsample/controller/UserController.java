package com.changhong.cloud.javarestsample.controller;

import com.changhong.cloud.javarestsample.pojo.User;
import com.changhong.cloud.javarestsample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:用例接口
 * 时间:2018-03-06 12:58
 *
 * @author:yjph83
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list() {
        return userService.listUser();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User list(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/add/{name}/{age}/{status}", produces = "application/text;charset=utf-8", method = RequestMethod.POST)
    public String saveUser(@PathVariable("name")String name,@PathVariable("age")int age,@PathVariable("status")short status){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setStatus(status);
        userService.saveUser(user);
        return "save User Success!";
    }

}
