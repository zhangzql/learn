package com.facebank.springbootmybatis;

import com.facebank.springbootmybatis.domain.User;
import com.facebank.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户Controller
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/getUser")
    @ResponseBody
    private List<User> getAllUser() {
        List<User> userList = userService.selectAll();
        return userList;
    }
}
