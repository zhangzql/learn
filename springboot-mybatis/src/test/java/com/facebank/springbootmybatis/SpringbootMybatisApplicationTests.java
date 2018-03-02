package com.facebank.springbootmybatis;

import com.facebank.springbootmybatis.domain.User;
import com.facebank.springbootmybatis.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {

		userMapper.insert("zhang", "12");
		User u = userMapper.findUserByName("zhang");
		System.out.println(u.toString());
		Assert.assertEquals("zhang", u.getName());
	}

}
