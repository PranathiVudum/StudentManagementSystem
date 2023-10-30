package com.exampleA.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleA.entity.User;
import com.exampleA.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.ServletException;


@RestController
@RequestMapping("/user")
public class UserController
{
	@Autowired
    private UserService userService;
	
	@PostMapping("/login")
	public String validate(@RequestBody User user) throws ServletException
	{
		String jwtToken="";
		if(user.getUserName()==null || user.getPassword()==null)
		{
			throw new ServletException("Please fill in username and password");
		}
		String userName=(String) user.getUserName();
		String userPassword=(String) user.getPassword();
		user=userService.login(userName, userPassword);
		
		if(user==null)
		{
			throw new ServletException("User not found");
		}
jwtToken= Jwts.builder().setSubject(userName).claim("user",user.getUserName()).setIssuedAt(new Date()).
		signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		return jwtToken;
	}
}