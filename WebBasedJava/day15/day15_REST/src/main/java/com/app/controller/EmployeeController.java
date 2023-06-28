package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController // =@Controller + @ResponseBody
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
//To Tell SC to add CORS resp header : cross origin resourse sharing  , 
//so that web browser security model allows accessing the resp.
public class EmployeeController {
	//dep : service layer i/f
	@Autowired
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("in def ctor of " + getClass());
	}
	//http://localhost:8080/employees/ , method = GET
	//add a req handling method to ret list of emps
	@GetMapping
	public List<Employee> listEmps() {
		System.out.println("in list emps");
		return empService.getAllEmployees();
	}
	//http://localhost:8080/employees/ , method = POST
		//add a req handling method to save an emp
	@PostMapping
	public Employee saveEmpDetails(@RequestBody Employee transientEmp)
	{
		System.out.println("in save "+transientEmp);//not null , id : null
		return empService.addEmpDetails(transientEmp);
	}
}
