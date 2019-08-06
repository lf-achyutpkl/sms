package com.vegaworks.oes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	private List<User> getUsers() {
		List<User> users = new ArrayList<>();
		
		users.add(new User().setId(1).setFullName("Ram Shrestha").setUsername("ram"));
		users.add(new User().setId(2).setFullName("Hari Shrestha").setUsername("hari"));
		
		return users;
	}
}
