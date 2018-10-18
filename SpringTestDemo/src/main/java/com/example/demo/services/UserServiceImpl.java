package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;


@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findUserByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public void saveUser(User user) {
		
		userRepository.save(user);
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
