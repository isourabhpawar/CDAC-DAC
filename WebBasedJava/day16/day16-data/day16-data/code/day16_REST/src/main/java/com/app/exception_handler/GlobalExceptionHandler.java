package com.app.exception_handler;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.ApiResponse;

//how to tell SC , following class is a spring bean , 
//containing common advice to all rest controllers
//regarding centralized exc handling
//@RestController =@ControllerAdvice+@ResponseBody 
//we can use it in RestWeb Services.

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentException(MethodArgumentNotValidException e) {
		Map<String,String> map=e.getFieldErrors().stream().collect(Collectors.toMap(f->f.getField(),f->f.getDefaultMessage()));
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
		
		
		//returns list of field errorrs
	}
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?>  handlerResourceNotFoundException(ResourceNotFoundException e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
		
	}

}
