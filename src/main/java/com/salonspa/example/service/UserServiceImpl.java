package com.salonspa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salonspa.example.dto.UserDto;
import com.salonspa.example.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto saveUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
