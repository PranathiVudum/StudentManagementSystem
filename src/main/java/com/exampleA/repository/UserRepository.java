package com.exampleA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleA.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>
{
       User findByUserNameAndPassword(String userName, String password);
}