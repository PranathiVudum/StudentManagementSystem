package com.exampleA.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleA.entity.User;
import com.exampleA.repository.UserRepository;
import com.exampleA.service.UserService;

@Service
public class UserServiceImple implements UserService
{
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User login(String userName, String userPassword) 
	{
		 User user=userRepository.findByUserNameAndPassword(userName, userPassword);
		 return user;
	}
}