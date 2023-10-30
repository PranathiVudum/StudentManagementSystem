package com.exampleA.entity;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends User{
	
	@Column(length = 50)
	private String name;
	@Column(length = 100)
	private String address;
	@Column(unique = true)
	private String phNo;
	//one teacher can teach many students
	@OneToMany(mappedBy = "teacher",cascade = CascadeType.PERSIST) //teacher id will be foreign key
	@JsonIgnoreProperties("teacher")
	List<Student> students;//in students table

	public void setStudents(List<Student> students2) {
		// TODO Auto-generated method stub
		
	}
	}
//teacher_id