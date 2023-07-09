package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;//all specs Java EE supplied

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "new_emps") // to specify table name
//lombok annotations
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class Employee extends BaseEntity {

	@Column(name = "first_name", length = 20) // varchar(20)
	private String firstName;
	@Column(name = "last_name", length = 20)
	private String lastName;
	@Column(length = 30, unique = true) // unique constraint
	private String email;
	@Column(length = 20, nullable = false) // NOT NULL constraint
	private String password;
	@Column(name = "join_date")
	private LocalDate joinDate;
	private double salary;
	@Column(length = 30)
	private String location;
	@Column(length = 30)
	private String department;
	private String imagePath;// path of the image uploaded on server side folder
	public Employee(String firstName, String lastName, String email, String password, LocalDate joinDate, double salary,
			String location, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.joinDate = joinDate;
		this.salary = salary;
		this.location = location;
		this.department = department;
	}
	

}
