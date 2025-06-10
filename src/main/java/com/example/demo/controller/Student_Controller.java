package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.IdNotFoundException;
import com.example.demo.exception.PasswordMismatchExcep;
import com.example.demo.model.Lectures_Reg;
import com.example.demo.model.Lectures_Val;
import com.example.demo.model.Student_Reg;
import com.example.demo.model.Student_Vali;
import com.example.demo.service.Service_Interface;

@RestController
public class Student {

	@Autowired
	private Service_Interface service;
	
	@PostMapping("/studentreg")
	public ResponseEntity<Student_Reg> register_details
	( @Validated @RequestBody Student_Vali student)
			throws MethodArgumentNotValidException{
		
		 Student_Reg r = service.student_data_insert(student);
		 return new ResponseEntity<Student_Reg>(r,HttpStatus.OK);
	}
	
	@PostMapping("/lecturesReg")
	public ResponseEntity<Lectures_Reg> register_details
	( @Validated @RequestBody Lectures_Val lecture)
			throws MethodArgumentNotValidException{
		
		 Lectures_Reg r = service.lecture_data_insert(lecture);
		 return new ResponseEntity<Lectures_Reg>(r,HttpStatus.OK);
	}
	
	@GetMapping("/loginValid")
	public String login_validate()throws IdNotFoundException,PasswordMismatchExcep{

		String role = service.login_Validate();
		return role;
	}
	

	

}
