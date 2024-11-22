package com.trackMyClass.dao;

import java.util.List;

import com.trackMyClass.entity.User;

public interface UserDao {
	
	public List<User> getAllUser();
	
	public String insertUser(User user);
	
	public User getUserbyId(String username);
	
	public String updateUser(User user);
	
	public String deleteUser(String username);
}
