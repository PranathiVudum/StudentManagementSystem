package com.exampleA.service;

import com.exampleA.entity.Teacher;
import com.exampleA.DTO.TeacherDTO;

public interface TeacherService
{
	TeacherDTO	registerTeacher(Teacher teacher);
	String assignStudentToTeacher(int tid,int sid);
}