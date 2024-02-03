package com.example.demo.model;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Controller
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")

@Table(name = "student_reg")
public class Student_Reg {

	
	@Id
	@GeneratedValue
	private Integer rollNo;
	private String firstName;
	private String lastName;
	private String branch;
	private Integer year;
	private String password;
	private String email;
	private Long contact;
	private String gender;
	private String address;
	private String role;

	
	
	
	
	
		
}
