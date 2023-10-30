package com.exampleA.serviceImple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleA.service.TeacherService;
import com.exampleA.entity.Student;
import com.exampleA.entity.Teacher;
import com.exampleA.exception.ResourceNotFoundException;
import com.exampleA.DTO.TeacherDTO;
import com.exampleA.repository.StudentRepository;
import com.exampleA.repository.TeacherRepository;
import com.exampleA.util.Converter;

@Service
public class TeacherServiceImple implements TeacherService 
{
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private Converter converter;
	
	@Override
	public TeacherDTO registerTeacher(Teacher teacher) {
	
		return converter.convertToTeacherDTO(teacherRepository.save(teacher));
	}

	@Override
	public String assignStudentToTeacher(int tid, int sid) {
		Student s=studentRepository.findById(sid).orElseThrow(()->
		new ResourceNotFoundException("Student", "Id", sid));
		
		Teacher  t=teacherRepository.findById(tid).orElseThrow(()->
		new ResourceNotFoundException("Teacher", "Id", tid));
		
		List<Student> students=new ArrayList<>();
		students.add(s);
		
		//assign students to teacher
		t.setStudents(students);
		
		//assign teacher to student
		s.setTeacher(t);
		
		teacherRepository.save(t);
		return "Students assigned to teacher successfully";
	}
}