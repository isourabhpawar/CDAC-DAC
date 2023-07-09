package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.app.entities.UserRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class UserDto {
	@JsonProperty(access=Access.READ_ONLY)
	private Long id;
	
	@NotBlank(message="fname cant be blank!!!")
	private String fname;
	@Size(min=4,max=20,message="invalid length of last name")
	private String lname;
	@Email
	private String email;
	
	private String password;
	@NotNull
	private UserRole role;
	
	

}
