package com.facebank.springbootmybatis.service.impl;

import com.facebank.springbootmybatis.domain.User;
import com.facebank.springbootmybatis.mapper.UserMapper;
import com.facebank.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean insert(User user) {
        userMapper.insert(user.getName(), user.getAge().toString());
        return false;
    }

    @Override
    public User selectByName(String name) {
        User user = userMapper.findUserByName(name);
        return user;
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
