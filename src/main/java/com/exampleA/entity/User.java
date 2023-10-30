package com.exampleA.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Registration")
@Inheritance(strategy=InheritanceType.JOINED)
public class User 
{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer userId;
   @Column(length=30)
   private String userName;
   @Column(length=30)
   private String password;
public Object getPassword() {
	// TODO Auto-generated method stub
	return null;
}
public Object getUserName() {
	// TODO Auto-generated method stub
	return null;
}
   
}