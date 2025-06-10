package com.example.demo.repo;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Lectures_Reg;
import org.springframework.data.repository.query.FluentQuery;

import java.util.function.Function;

public interface Lectures_Repo extends JpaRepository<Lectures_Reg, Integer>{

	 Lectures_Reg findByEmail(String mail);

	@Override
	<S extends Lectures_Reg, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
