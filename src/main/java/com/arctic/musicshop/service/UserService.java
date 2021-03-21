package com.arctic.musicshop.service;

import com.arctic.musicshop.mapper.UserMapper;
import com.arctic.musicshop.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int getPassWord(String username) {
        int pwd = userMapper.getPasswordByName(username);
        return pwd;
    }

    public User getUser(String username) {
        return userMapper.getUser(username);
    }
}
