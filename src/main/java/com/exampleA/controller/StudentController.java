package com.exampleA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleA.service.TeacherService;
import com.exampleA.util.Converter;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private TeacherService teacherService;
	
	StudentController(Converter converter) {
    }
	
	@PostMapping("/assignment/{tid}/{sid}")
	public String assignStudentToTeacher(@PathVariable("tid") int tid,
			@PathVariable("sid") int sid)
	{
		return teacherService.assignStudentToTeacher(tid, sid);
	}
}