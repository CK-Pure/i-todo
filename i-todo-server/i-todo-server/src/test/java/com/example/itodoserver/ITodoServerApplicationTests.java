package com.example.itodoserver;

import com.example.itodoserver.entity.User;
import com.example.itodoserver.mapper.UserMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ITodoServerApplicationTests {

	@Autowired
	UserMapper userMapper;
	@DisplayName("测试mybatis-plus操作")
	@Test
	void contextLoads() {
		List<User> userList = userMapper.selectList(null);
		userList.forEach(System.out::println);
	}

}
