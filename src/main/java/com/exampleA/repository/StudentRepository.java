package com.exampleA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleA.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>
{

}