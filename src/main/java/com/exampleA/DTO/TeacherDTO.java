package com.exampleA.DTO;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.exampleA.entity.Student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherDTO
{
	@NotNull
    private String name;
	@NotNull
	private String address;
	@NotNull
	private String phNo;
	
	List<Student> students;
}