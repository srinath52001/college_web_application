package com.example.demo.exception;



import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class MainExceptionHandler {

	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> handleLoginException(IdNotFoundException id)
	{
		
		return new ResponseEntity<String>(id.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<List<String>> 
	handleRegisterVali(MethodArgumentNotValidException reg)
	{
		List<String> li = new ArrayList<>();
		reg.getBindingResult().getAllErrors().forEach((error)->{
			li.add(error.getDefaultMessage());
		});
		return new ResponseEntity<List<String>>(li, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(PasswordMismatchExcep.class)
	public ResponseEntity<String> passwordExceptionHandler(PasswordMismatchExcep pass)
	{
		return new ResponseEntity<String>(pass.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
