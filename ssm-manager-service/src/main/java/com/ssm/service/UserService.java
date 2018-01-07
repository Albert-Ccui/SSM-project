package com.ssm.service;

import com.ssm.pojo.User;

public interface UserService extends BaseService<User> {
	public User login(User user);
}
