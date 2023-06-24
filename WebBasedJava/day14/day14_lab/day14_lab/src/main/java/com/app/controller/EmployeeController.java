package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	// dep : service layer i/f
	@Autowired
	private EmployeeService empService;

	public EmployeeController() {
		System.out.println("in ctor of " + getClass());
	}

	/*
	 * http://host:port/day14_boot/emp/list , method=post payload(req body) :
	 * dept_id=1
	 */
	// @RequestParam : annotation to bind incoming rq param -->
	// method argument , does the parsing also!
	// MATCH rq param name with method arg name
	// SC : Long dept_id=Long.parseLong(request.getParameter("dept_id"));
	@PostMapping("/list")
	public String listEmpsByDept(@RequestParam Long dept_id, Model map) {
		System.out.println("in list emps by dept " + dept_id);
		map.addAttribute("emp_list", empService.getAllEmpsByDeptId(dept_id));
		return "/emp/list";// AVN : /WEB-INF/views/emp/list.jsp
	}

	// http://host:port/day14_boot/emp/signin , method=GET
	@GetMapping("/signin")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/emp/login";// AVN : /WEB-INF/views/emp/login.jsp
	}

	// http://host:port/day14_boot/emp/signin , method=POST
	@PostMapping("/signin")
	public String processLoginForm(@RequestParam String email,
			@RequestParam String password, Model map) {
		System.out.println("in process login form "+email+" "+password);
		Employee emp = empService.authenticateEmp(email,password);
		if(emp != null)  //valid login --> forward the clnt to details page
		{
			map.addAttribute("emp_dtls", emp);
			return "/emp/details";//AVN : /WEB-INF/views/emp/details.jsp
		}
		//=> invalid login
		return "/emp/login";			
	}
}
