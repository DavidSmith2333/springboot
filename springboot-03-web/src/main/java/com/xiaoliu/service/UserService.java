package com.xiaoliu.service;

import com.xiaoliu.mapper.UserMapper;
import com.xiaoliu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(String username, String password) {
        User user = userMapper.findLogin(username, password);
        return user;
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public User findUserByName(String username) {
        return userMapper.findUserByName(username);
    }

    public int deleteUser(String username) {
        return userMapper.deleteUser(username);
    }

}
