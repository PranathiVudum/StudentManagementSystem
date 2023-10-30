package com.exampleA.serviceImple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleA.service.StudentService;
import com.exampleA.entity.Student;
import com.exampleA.exception.ResourceNotFoundException;
import com.exampleA.DTO.StudentDTO;
import com.exampleA.repository.StudentRepository;
import com.exampleA.util.Converter;

@Service
public class StudentServiceImple implements StudentService 
{
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private Converter converter;
	
	@Override
	public StudentDTO createStudent(Student student) {
		student.setUserName(student.getUserName());
		student.setPassword(student.getPassword());
		Student stud=studentRepository.save(student);
		return converter.convertToStudentDTO(stud);
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		List<Student> students=studentRepository.findAll();
		
		//list of type DTO
		List<StudentDTO> dtoList=new ArrayList<>();
		for(Student s:students)
		{
			dtoList.add(converter.convertToStudentDTO(s));
		}
		
		return dtoList;
	}

	@Override
	public StudentDTO getStudentById(int id) {
		Student s=studentRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Student", "Id", id));
		return converter.convertToStudentDTO(s);
	}

	@Override
	public StudentDTO updateStudent(int id, Student student) {
		Student s=studentRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Student", "Id", id));
		s.setUserName(student.getUserName());
		s.setAddress(student.getClass());
		s.setPhNo(student.getPhNo());
		
		Student stud=studentRepository.save(s);
		return converter.convertToStudentDTO(stud);
	}

	@Override
	public String deleteStudent(int id) {
		studentRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Student", "Id", id));
		
		studentRepository.deleteById(id);
		return "Students got deleted successfully!!";
				
	}
}