package com.trackMyClass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackMyClass.dao.UserDao;
import com.trackMyClass.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public List<User> getAllUser() {
		return dao.getAllUser();
	}

	@Override
	public String insertUser(User user) {

		return dao.insertUser(user);
	}

	@Override
	public User getUserbyId(String username) {

		return dao.getUserbyId(username);
	}

	@Override
	public String updateUser(User user) {

		return dao.updateUser(user);
	}

	@Override
	public String deleteUser(String username) {

		return dao.deleteUser(username);
	}

}
