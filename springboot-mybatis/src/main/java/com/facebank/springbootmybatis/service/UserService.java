package com.facebank.springbootmybatis.service;

import com.facebank.springbootmybatis.domain.User;

import java.util.List;

/**
 * 用户表接口
 */
public interface UserService {

    /**
     * 插入新用户
     * @param user
     * @return
     */
    boolean insert(User user);

    /**
     * 根据姓名查询用户
     * @param name
     * @return
     */
    User selectByName(String name);

    /**
     * 搜索所有用户
     * @return
     */
    List<User> selectAll();
}
