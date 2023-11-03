package com.criatosoft.cswebsite.app.main.service;

import java.util.List;

import com.criatosoft.cswebsite.app.main.model.StudentInquiry;
import com.criatosoft.cswebsite.app.main.model.StudentReg;

public interface HomeService {
	//Add Methods
	void addNewEnq(StudentInquiry si);
	void addNewReg(StudentReg sr);
	
	
	//View Method
	List viewAllReg(String u,String p);
	
	
	//Delete Method  Student Reg
	List deleteStudentReg(long mobNo);
	

}
