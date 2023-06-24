package com.app.controller;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller // mandatory to tell SC : following is req handling
//controller=Handler , containg req handling methods
public class HomePageController {
	public HomePageController() {
		System.out.println("in ctor of " + getClass());
	}

	// add req handling method to forward the clnt to index.jsp
	@RequestMapping("/") // can intercept get/put/post/delete...
	//Map : ModelMap => map of model attrs
	public String showHomePage(Model modelMap) {
		System.out.println("in show home page : "+modelMap);//{} empty map
		modelMap.addAttribute("timestamp", LocalDateTime.now())
		.addAttribute("number_list", Arrays.asList(1,2,3,4));
		return "/index";
		//Handler method explicitly rets --->LVN --> D.S , SC : impl returns model map 
		//D.S --> LVN --> V.R --> AVN  --> D.S --> adds all model attrs unde r req scope
		//--> forwards to the view layer
	}
}
