package com.chinaunicom.usercenter.controller;

import com.chinaunicom.usercenter.model.ResponseResult;
import com.chinaunicom.usercenter.model.User;
import com.chinaunicom.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/all")
    public List<User> listAllUser() {

//        // 创建了一个用户对象
//        User user = new User();
//        user.setId(1);
//        user.setAge(20);
//        user.setBirthday("2000-10-01");
//        user.setName("小王");
//
//        // 将用户对象插入一个用户列表
//        List<User> users = new ArrayList<>();
//        users.add(user);

        List<User> users = userService.getAllUser();

        return users;
    }


    @RequestMapping(value = "/single", method = RequestMethod.PUT)
    public ResponseResult putUser(User user) {
        // TODO: 插入用户
        ResponseResult result = new ResponseResult();
        return result;
    }


    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        // TODO: 通过id查到具体的用户
        User user = userService.getUserByID(id);
        return user;
    }

}
