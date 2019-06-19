package com.example.demo.Entity;

public class User {
	public String name;
	public String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(String name , String gender) {
		this.gender = gender;
		this.name = name;
	}
	
}
