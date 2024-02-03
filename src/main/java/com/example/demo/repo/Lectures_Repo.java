package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Lectures_Reg;

public interface Lectures_Repo extends JpaRepository<Lectures_Reg, Integer>{

	 Lectures_Reg findByEmail(String mail);
}
