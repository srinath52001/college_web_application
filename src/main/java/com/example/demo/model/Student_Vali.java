package com.example.demo.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")

public class Student_Vali {

	
	@NotBlank(message = "fname must not be emoty")
	private String firstName;
	@NotBlank(message =  "lname must not be empty")
	private String lastName;
	@NotBlank(message="branch should be not zero..")
	private String branch;
	@NotNull(message = "year must not ne empty")
	private Integer year;
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&])(?=\\S+$).{8,}$",
			message = "password must be in professional format")
	private String password;
	@Email
	private String email;
	@NotNull(message = "mobile must not be  null")
	private Long contact;
	@NotBlank(message="gender should be not empty..")
	private String gender;
	@NotBlank(message="address should be not blank..")
	private String address;
	private String role="Student";

	
	
	
	
	
		
}
