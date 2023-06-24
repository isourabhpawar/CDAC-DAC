package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.service.DepartmentService;

@Controller
@RequestMapping("/departments") // optional but reco for separation
//: this spring bean will handle all dept related requests
public class DepartmentController {
	//dependency : service layer i/f 
	@Autowired //by type, field level DI
	private DepartmentService deptService;	
	public DepartmentController() {		
		System.out.println("in ctor of " + getClass());
	}
	//add a req handling method :
	@GetMapping("/list")
	public ModelAndView getDeptList() {
		System.out.println("in get dept list");
		return new ModelAndView("/dept/list", 
				"dept_list", deptService.getAllDepts());
		//controller ---> MnV --> D.S --> LVN --> V.R --> 
		//AVN : /WEB-INF/views/dept/list.jsp --> D.S chks for model
		//--> YES --> request.setAttribute("dept_list", dept list); 
		//--> RD rd=request.getRD("/WEB-INF/views/dept/list.jsp");
		//rd.forward(request,resp) --> JSP : ${...}
	}
}





