package com.app.service;

import java.util.List;

import com.app.dto.AuthRequestDTO;
import com.app.dto.AuthRespDTO;
import com.app.entities.Employee;

public interface EmployeeService {
//add a method to get all emps
	List<Employee> getAllEmployees();

	Employee addEmpDetails(Employee transientEmp);

	String deleteEmpDetails(Long empId);

	Employee getEmpDetails(Long empId);

	Employee updateEmpDetails(Employee detachedEmp);

	AuthRespDTO authenticateEmp(AuthRequestDTO request);
}
