package com.example.demo.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService ;
	ArrayList<User> al = new ArrayList<>();
	
	@RequestMapping("/")
	public String ex1() {
		return "Hello World!";
	}
	
	User user = new User("teju","female");
	@RequestMapping("/user")
	public User ex2() {
		return user;
	}
	
	@GetMapping("/")
	public User retriveByName(@RequestBody User user) {
		return userService.retrieveByName(user , al);
	}
		
	
	@GetMapping("/user/{name}/{gender}")
	public User getUserByName( @PathVariable("name") String name , @PathVariable String gender ) {
		User user = null;
		if(gender.equalsIgnoreCase("male") && name.equalsIgnoreCase("john")) {
			user = new User("male" , "john");
		}
		else {
			return user;
		}
		return user;
	}
	
	
	@PostMapping("/user")
	public ArrayList<User> createUser(@RequestBody User user) {
		al.add(user);
		System.out.println(al);
		return al;
		
	}
		
	@PutMapping("/user")
	public ArrayList<User> putMethod(@RequestBody User user ) {
		for(User i : al) {
			if(i.name.equals(user.name) ) {
				i.gender = user.gender;
				break; 
			}
		}
		System.out.println(al);
		return al;
	} 
	
	@DeleteMapping("/user")
	public ArrayList<User> deleteMethod(@RequestBody User user) {
		al.remove(user);	
		System.out.println(al);
		return al;
	} 
}
