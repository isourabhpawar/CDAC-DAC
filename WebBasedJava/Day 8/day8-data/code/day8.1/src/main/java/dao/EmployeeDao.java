package dao;

import java.time.LocalDate;
import java.util.List;

import pojos.Employee;
import pojos.EmploymentType;

public interface EmployeeDao {
//add a method to insert new emp details
	String insertEmployeeDetails(Employee emp);

	// add a method to insert new emp details : using getCurrentSession
	String insertEmployeeDetailsCurrentSession(Employee emp);

	// add a method to get emp details by it's id
	Employee getEmpDetails(int empId);// int --> Integer --> Serializable
	// add a method to get details of all emps

	List<Employee> getAllEmps();

	// add a method to get emp details by date n salary
	List<Employee> getEmpsByDateAndSalary(LocalDate begin, LocalDate end, double minSal);
	
	// add a method to get emp last names by emp type
		List<String> getEmpLastNamesByType(EmploymentType empType);
		//add a method to test JPA ctor expression
		List<Employee> testConstructorExpression(EmploymentType empType);
		//add a method to update emp salary
		String updateEmpSalary(String email,String pwd,double salIncrement);
}
