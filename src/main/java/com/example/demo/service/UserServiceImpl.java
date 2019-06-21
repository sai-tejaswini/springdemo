package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.example.demo.Entity.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public User create(User user) {
		return null;
	}

	@Override
	public User retrieveByName(User user, ArrayList<User> al) {
		for(User i : al) {
			if(i.name.equals(user.name) ) {
				return i;
			}
		}
		return null;
	}

	@Override
	public User update(User user) {
				return null;
	}

	@Override
	public void deleteByName(String name) {
				
	}
	
}
