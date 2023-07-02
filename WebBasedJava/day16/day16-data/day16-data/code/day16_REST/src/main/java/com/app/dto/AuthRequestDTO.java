package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class AuthRequestDTO {
	//desierialization via getters
	@NotBlank(message="email not found")
	@Email
	private String email;
	@NotBlank
	//@Pattern(regexp="^aaa")
	private String password;
}
