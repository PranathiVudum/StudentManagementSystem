package com.exampleA.service;

import java.util.List;

import com.exampleA.entity.Student;
import com.exampleA.DTO.StudentDTO;

public interface StudentService 
{
	StudentDTO createStudent(Student student);
	List<StudentDTO> getAllStudents();
	StudentDTO getStudentById(int id);
	StudentDTO updateStudent(int id,Student student);
	String deleteStudent(int id);
}