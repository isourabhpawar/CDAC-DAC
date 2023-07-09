package com.app.dto;

import javax.validation.Valid;
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
import lombok.ToString;

/*
 * fn , ln  : non blank
email : valid
password : strong
user role : must be supplied.
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
//@Valid
public class UserDTO {
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	@NotBlank(message = "first name can't be blank!!!")
	private String firstName;
	@Size(min = 4, max = 20, message = "Invalid length of last name")
	private String lastName;
	@Email
	private String email;
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})"
			, message = "Invalid password!!!")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	@NotNull(message = "role must be supplied!")
	private UserRole role;
	public UserDTO(@NotBlank(message = "first name can't be blank!!!") String firstName,
			@Size(min = 4, max = 20, message = "Invalid length of last name") String lastName, @Email String email,
			@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})", message = "Invalid password!!!") String password,
			@NotNull(message = "role must be supplied!") UserRole role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
}
