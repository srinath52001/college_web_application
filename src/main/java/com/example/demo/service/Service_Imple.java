package com.example.demo.service;

import javax.security.auth.login.LoginContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.IdNotFoundException;
import com.example.demo.exception.PasswordMismatchExcep;
import com.example.demo.model.Lectures_Reg;
import com.example.demo.model.Lectures_Val;
import com.example.demo.model.LoginData;
import com.example.demo.model.Student_Reg;
import com.example.demo.model.Student_Vali;
import com.example.demo.repo.College_repo;
import com.example.demo.repo.Lectures_Repo;

@Service
public class Service_Imple implements Service_Interface {

	@Autowired
	private College_repo repo;
	@Autowired
	private Lectures_Repo repo1;
	@Autowired
	private LoginData loginData;

	// for insert Student details in DAtaBase
	@Override
	public Student_Reg student_data_insert(Student_Vali student) {
		Student_Reg data = Student_Reg.build(0, student.getFirstName(), student.getLastName(), student.getBranch(),
				student.getYear(), student.getPassword(), student.getEmail(), student.getContact(), student.getGender(),
				student.getAddress(), student.getRole());
		return repo.save(data);
	}

	// for inserting Lectures Details
	@Override
	public Lectures_Reg lecture_data_insert(Lectures_Val teacher) {
		Lectures_Reg data2 = Lectures_Reg.build(0, teacher.getFirstName(), teacher.getLastName(), teacher.getSubject(),
				teacher.getExperience(), teacher.getPassword(), teacher.getEmail(), teacher.getContact(),
				teacher.getGender(), teacher.getAddress(), teacher.getRole());
		return repo1.save(data2);
	}

	// for Login Validation
	@Override
	public String login_Validate() {
		
		String mailId = loginData.getEmail();
		String passWord = loginData.getPassword();
		Student_Reg stu = repo.findByEmail(mailId);
		Lectures_Reg lec = repo1.findByEmail(mailId);
		String s="";
		if (stu != null) {
			String pass1 = stu.getPassword();
			if (pass1.equals(passWord)) {
				 s = stu.getRole();
			} else {
				throw new PasswordMismatchExcep("Password is Not Found");
			}
		} else if (lec != null) {
			String pass2 = lec.getPassword();
			if (pass2.equals(passWord)) {
				s =  lec.getRole();
			} else {
				throw new PasswordMismatchExcep("Password is Not Found");
			}
		} else {
			throw new IdNotFoundException("mailId not found " + mailId);
		}
		return s;

	}
	

}
