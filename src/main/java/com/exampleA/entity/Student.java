package com.exampleA.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor

public class Student extends User
{
	@Column(length = 50)
	private String name;
	@Column(length = 100)
	private String address;
	@Column(unique = true)
	private String phNo;
	//many students -one teacher
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "tId")
	@JsonIgnoreProperties("students")
	private Teacher teacher;

	public Object getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserName(Object userName) {
		// TODO Auto-generated method stub
		
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword(Object password) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress(Class<? extends Student> class1) {
		// TODO Auto-generated method stub
		
	}

	public Object getPhNo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPhNo(Object phNo2) {
		// TODO Auto-generated method stub
		
	}

	public void setTeacher(Teacher t) {
		// TODO Auto-generated method stub
		
	}
}