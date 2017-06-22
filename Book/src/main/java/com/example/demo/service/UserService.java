package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userrepository;

	public User findByUserNameAndPassword(String userName, String password) {
		User user = userrepository.findByUserName(userName);
		return userrepository.findByUserNameAndPassword(userName, user.getPassword());
	}

	public List<User> findAll() {
		return userrepository.findAll();
	}

	public User findOne(int id) {
		return userrepository.findOne(id);
	}

}