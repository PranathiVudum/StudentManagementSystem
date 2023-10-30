package com.exampleA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleA.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{

}