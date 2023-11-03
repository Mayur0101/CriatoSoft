package com.criatosoft.cswebsite.app.main.controller;

import java.util.List;

import org.hibernate.dialect.MySQL55Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criatosoft.cswebsite.app.main.model.StudentReg;
import com.criatosoft.cswebsite.app.main.service.HomeService;


@RestController
public class HomeController {
	
	@Autowired 
	HomeService hs;
	
	@RequestMapping("/save")
	public String saveData()
	{
		StudentReg sr = new StudentReg();
		sr.setAltMobNo(20000);
		sr.setMobNo(1001);
		sr.setAddr("Jalgoan");
		sr.setCourseMode("off");
		sr.setGender("f");
		hs.addNewReg(sr);
		System.out.println("Save SucessFully");
		return "Add Ok";
	}
	
	@RequestMapping("/getData/{u}/{p}")
	public List getData(@PathVariable String u,@PathVariable String p)
	{
		List l = hs.viewAllReg(u, p);
		return l;
	}
	
	@RequestMapping("/delete/{mobNo}")
	public List deleteStudentReg(@PathVariable long mobNo)
	{
		List list = hs.deleteStudentReg(mobNo);
		return list;
	}
	
	
	

}
