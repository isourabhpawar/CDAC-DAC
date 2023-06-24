package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	//derived finder method
	List<Employee> findByAssignedDeptId(Long deptId);

	Employee findByEmailAndPassword(String email1, String password1);
	
}
