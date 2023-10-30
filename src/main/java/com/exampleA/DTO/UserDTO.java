package com.exampleA.DTO;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserDTO 
{
	@NotNull
	  private Integer userId;
	@NotNull
	   private String userName;
	@NotNull
	   private String password;
}