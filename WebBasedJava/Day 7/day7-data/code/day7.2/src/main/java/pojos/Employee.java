package pojos;
/*
 * emp_id(PK) ,first_name,last_name,email(unique),password
 * ,join_date,emp_type(full_time/part_time/contract...),salary

 */

import java.time.LocalDate;
import javax.persistence.*;
@Entity //mandatory
public class Employee {
//Mandatory requirement : unique ID prop : Serializable
	@Id
	private Integer empId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDate joinDate;
	private EmploymentType type;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	//all setters n getters
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public EmploymentType getType() {
		return type;
	}
	public void setType(EmploymentType type) {
		this.type = type;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", joinDate=" + joinDate + ", type=" + type + ", salary=" + salary + "]";
	}
	
	
}
