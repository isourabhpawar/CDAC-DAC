package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.AuthRequestDTO;
import com.app.dto.AuthRespDTO;
import com.app.entities.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	// dep : emp repo i.f
	@Autowired // by type : Field Level DI
	private EmployeeRepository empRepo;
	// dep : model mapper bean : for auto conversion entity --> dto
	@Autowired // by type : field level DI
	private ModelMapper mapper;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee addEmpDetails(Employee transientEmp) {
		// TODO Auto-generated method stub
		return empRepo.save(transientEmp);
	}

	@Override
	public String deleteEmpDetails(Long empId) {
		String mesg = "Emp id invalid , can't delete emp details ";
		if (empRepo.existsById(empId)) {
			empRepo.deleteById(empId);
			mesg = "Emp with ID=" + empId + "  deleted !";
		}
		return mesg;
	}

	@Override
	public Employee getEmpDetails(Long empId) {
		// TODO Auto-generated method stub
		return empRepo.findById(empId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Emp ID , Can't get emp details!!!!"));
	}

	@Override
	public Employee updateEmpDetails(Employee detachedEmp) {
		// H.W : check if emp exists by id
		return empRepo.save(detachedEmp);
	}

	@Override
	public AuthRespDTO authenticateEmp(AuthRequestDTO request) {
		// get email n pwd from request dto n invoke emp repo method : inherited API |
		// finder | custom query methods
		Employee emp = empRepo.findByEmailAndPassword(request.getEmail(), request.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Emp not found : Invalid Email or password"));
		// emp : persistent Entity ---> DTO
		AuthRespDTO authRespDTO = mapper.map(emp, AuthRespDTO.class);
		return authRespDTO;
		/*
		 * 1. ModelMapper : create instance of DTO --calls MATCHING setters
		 *  --populates  DTO from src entity n rets it to the controller
		 */
	}

}
