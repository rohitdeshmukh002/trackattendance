package com.trackMyClass.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trackMyClass.entity.User;
import com.trackMyClass.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/get-all-users")
	public List<User> getAllUser() {

		return service.getAllUser();
	}

	@PostMapping("/add-user")
	public String insertUser(@RequestBody User user) {

		return service.insertUser(user);
	}

	@GetMapping("/get-user-by-id/{username}")
	public User getUSerbyId(@PathVariable String username) {

		return service.getUserbyId(username);

	}

	@PutMapping("/update-user")
	public String updateUser(@RequestBody User user) {

		return service.updateUser(user);
	}

	@DeleteMapping("/delete-user/{username}")
	public String deleteStudent(@PathVariable String username) {

		return service.deleteUser(username);
	}
}
