package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter //de ser
@Getter // getting em n pwd
@ToString //only for debugging
//P.L validations 
public class AuthRequestDTO {
	@NotBlank(message ="Email can't be blank!!!" )
	@Email(message = "Invalid email format!!!!!")
	private String email;
	@NotBlank(message = "Password is required!!!")
	private String password;
}
