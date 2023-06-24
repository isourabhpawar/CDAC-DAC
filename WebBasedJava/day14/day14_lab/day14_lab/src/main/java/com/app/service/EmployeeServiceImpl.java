package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.pojos.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
//dep : emp dao
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public List<Employee> getAllEmpsByDeptId(Long deptId) {
		// TODO Auto-generated method stub
		return empDao.findByAssignedDeptId(deptId);
	}

	@Override
	public Employee authenticateEmp(String email, String password) {
		// TODO Auto-generated method stub
		return empDao.findByEmailAndPassword(email,password);
	}
	

}
