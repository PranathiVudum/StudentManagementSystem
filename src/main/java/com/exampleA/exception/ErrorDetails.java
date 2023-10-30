package com.exampleA.exception;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails
{
	@NotNull
	private Date timeStamp;
	@NotNull
	private String mesage;
	@NotNull
	private String details;//api uri
}