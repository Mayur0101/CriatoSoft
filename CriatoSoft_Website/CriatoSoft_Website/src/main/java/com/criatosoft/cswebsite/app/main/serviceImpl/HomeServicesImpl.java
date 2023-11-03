package com.criatosoft.cswebsite.app.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criatosoft.cswebsite.app.main.model.StudentInquiry;
import com.criatosoft.cswebsite.app.main.model.StudentReg;
import com.criatosoft.cswebsite.app.main.repository.studentEnqRepositry;
import com.criatosoft.cswebsite.app.main.repository.studentRegisRepositry;
import com.criatosoft.cswebsite.app.main.service.HomeService;

@Service
public class HomeServicesImpl implements HomeService{
	//Student Register Process
	@Autowired
	studentRegisRepositry srr;
	
	//Student Enq Process
	@Autowired
	studentEnqRepositry ser;

	@Override//add new Enq
	public void addNewEnq(StudentInquiry si) {
		ser.save(si);
		
	}

	@Override//add new Reg
	public void addNewReg(StudentReg sr) {
		srr.save(sr);
		
	}
	
	//All Data Here
	public List allData()
	{
		List<StudentReg> findAll = srr.findAll();
		return findAll;
	}
	
	

	@Override
	public List viewAllReg(String u, String p) {
		if(u.equals("admin")&&p.equals("admin"))
		{
			return allData();
		}
		
		return null;
	}

	@Override//Delete Student Reg
	public List deleteStudentReg(long mobNo) {
		
		srr.deleteById(mobNo);
		
		return allData();
	}
	
	
	
	

}
