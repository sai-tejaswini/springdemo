package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.Entity.User;

public interface UserService {
	User create(User user);
	User retrieveByName(User user, ArrayList<User> al);
	User update(User user);
	void deleteByName(String name);
}
