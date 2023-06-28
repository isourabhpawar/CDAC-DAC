package com.app.service;

import java.util.List;

import com.app.entities.Employee;

public interface EmployeeService {
//add a method to get all emps
	List<Employee> getAllEmployees();

	Employee addEmpDetails(Employee transientEmp);
}
