package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDto;
import com.app.entities.UserEntity;
import com.app.repository.UserRepo;

@RestController
@RequestMapping("/users")
public class UserController {
	//@Autowired
//	private UserService userService;
//	
//	
//	
//	@PostMapping("/signup")
//	public ResponseEntity<?> myauth(@RequestBody @Valid UserDto userDto){
//		return userservice.createNewUser();
//		
//		
		
//}

}
