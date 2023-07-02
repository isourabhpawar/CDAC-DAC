package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	public HomePageController() {
		System.out.println("in ctor of " + getClass());
	}
	@GetMapping("/")
	public List<Integer> getNumberList() {
		System.out.println("in get number list");
		return Arrays.asList(10,20,30,40);
	}
}
