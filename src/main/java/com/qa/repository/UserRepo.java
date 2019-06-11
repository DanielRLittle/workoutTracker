package com.qa.repository;

import java.util.List;

import com.qa.model.User;

public interface UserRepo {

	public User createUser(User user);
	
	public User readUser(int id);
	
	public List<User> readAll();
	
	public User updateFirstName(int id, User user);
	
	public User updateLastName(int id, User user);
	
	public void deleteUser(int id);
}
