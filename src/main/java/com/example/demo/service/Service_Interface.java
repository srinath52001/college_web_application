package com.example.demo.service;

import com.example.demo.model.Lectures_Reg;
import com.example.demo.model.Lectures_Val;
import com.example.demo.model.Student_Reg;
import com.example.demo.model.Student_Vali;


public interface Service_Interface {

		Student_Reg student_data_insert(Student_Vali student); // to register Student details

		String login_Validate();// to check login activity

		Lectures_Reg lecture_data_insert(Lectures_Val student); // to register Lectures Details
}
