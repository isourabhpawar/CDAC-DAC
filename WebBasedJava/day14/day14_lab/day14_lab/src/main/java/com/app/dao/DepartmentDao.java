package com.app.dao;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Department;





public interface DepartmentDao extends JpaRepository<Department, Long> {
//add a method to get all depts
	//List<Department> getAllDepartments(); //will be replaced by inherited API : findAll
}//
