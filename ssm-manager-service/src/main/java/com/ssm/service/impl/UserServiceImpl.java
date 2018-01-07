package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int insert(User entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User select(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userMapper.login(user);
	}

}
