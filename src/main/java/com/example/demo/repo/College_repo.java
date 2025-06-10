package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student_Reg;

public interface College_repo extends JpaRepository<Student_Reg, Integer>{

	Student_Reg findByEmail(String mail);
	
}
