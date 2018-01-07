package com.ssm.dao;

import com.ssm.pojo.User;

public interface UserMapper extends BaseMapper<User> {
	public User login(User user);
}
