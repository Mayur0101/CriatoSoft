package com.criatosoft.cswebsite.app.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criatosoft.cswebsite.app.main.model.StudentReg;

@Repository
public interface studentRegisRepositry extends JpaRepository<StudentReg, Long>{
	
	
	

}
