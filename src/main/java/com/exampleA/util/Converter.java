package com.exampleA.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.exampleA.entity.Student;
import com.exampleA.entity.Teacher;
import com.exampleA.DTO.StudentDTO;
import com.exampleA.DTO.TeacherDTO;

@Component
public class Converter 
{
	public  Student convertToStudentEntity(StudentDTO studentDTO)
	{
		Student student=new Student();
		if(studentDTO!=null)
		{
			BeanUtils.copyProperties(studentDTO, student);
		}
	     return student;
	}

	//convert from Entity to DTO
	public StudentDTO convertToStudentDTO(Student student)
	{
		StudentDTO studentDTO=new StudentDTO();
		if(student!=null)
		{
			BeanUtils.copyProperties(student, studentDTO);
		}
		return studentDTO;
	}



	//convert from DTO to Entity

	public  Teacher convertToTeacherEntity(TeacherDTO teacherDTO)
	{
		Teacher teacher=new Teacher();
		if(teacherDTO!=null)
		{
			BeanUtils.copyProperties(teacherDTO, teacher);
		}
	     return teacher;
	}

	//convert from Entity to DTO
	public TeacherDTO convertToTeacherDTO(Teacher teacher)
	{
		TeacherDTO teacherDTO=new TeacherDTO();
		if(teacher!=null)
		{
			BeanUtils.copyProperties(teacher, teacherDTO);
		}
		return teacherDTO;
	}
}