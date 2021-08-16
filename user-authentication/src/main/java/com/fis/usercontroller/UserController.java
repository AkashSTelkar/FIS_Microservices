package com.fis.usercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.user.bean.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/{username}")
	public User getUser(@PathVariable String username) {
		return new User(101, "Akash", 425);
	}

}