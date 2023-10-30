package com.exampleA.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleA.entity.Teacher;
import com.exampleA.DTO.TeacherDTO;
import com.exampleA.service.TeacherService;
import com.exampleA.util.Converter;

@RestController
@RequestMapping("/api")
public class TeacherController
{
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private Converter converter;
	@PostMapping("/createTeacher")	
	 ResponseEntity<TeacherDTO> registerTeacher(@Valid @RequestBody TeacherDTO teacherDTO)	
	 {
		final Teacher teacher=converter.convertToTeacherEntity(teacherDTO);
		return new ResponseEntity<TeacherDTO>(teacherService.registerTeacher(teacher),HttpStatus.CREATED); 
	 }
	
}