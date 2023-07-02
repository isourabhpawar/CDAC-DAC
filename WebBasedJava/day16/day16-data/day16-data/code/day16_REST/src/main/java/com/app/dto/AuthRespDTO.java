package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRespDTO {	
	private String firstName;	
	private String lastName;	
	private LocalDate joinDate;
	private double salary;	
	private String location;	
	private String department;
}
