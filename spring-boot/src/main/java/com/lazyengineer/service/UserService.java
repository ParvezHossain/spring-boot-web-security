package com.lazyengineer.service;

import com.lazyengineer.model.User;

public interface UserService {
	public User findUserByEmail(String email);

	public void saveUser(User user);
}
