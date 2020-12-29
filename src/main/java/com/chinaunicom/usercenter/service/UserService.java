package com.chinaunicom.usercenter.service;

import com.chinaunicom.usercenter.dao.UserMapper;
import com.chinaunicom.usercenter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public User getUserByID(Integer id) {
        // TODO: 查询数据库
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    public List<User> getAllUser() {
        List<User> users = userMapper.selectAll();
        return users;
    }

}
