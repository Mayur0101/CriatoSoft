package com.criatosoft.cswebsite.app.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentReg {
	
	@Id
	private String name;
	private String addr;
	private long mobNo;
	private long altMobNo;
	private String emial;
	private String gender;
	private long parentMobNo;
	
	private String  education;
	private String clgName;
	private int yop;
	
	private String courseName;
	private String courseMode;
	private String courseType;
	
	private float totalFees;
	private float installment;
	private String firstInstallmentDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public long getAltMobNo() {
		return altMobNo;
	}
	public void setAltMobNo(long altMobNo) {
		this.altMobNo = altMobNo;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getParentMobNo() {
		return parentMobNo;
	}
	public void setParentMobNo(long parentMobNo) {
		this.parentMobNo = parentMobNo;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseMode() {
		return courseMode;
	}
	public void setCourseMode(String courseMode) {
		this.courseMode = courseMode;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public float getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(float totalFees) {
		this.totalFees = totalFees;
	}
	public float getInstallment() {
		return installment;
	}
	public void setInstallment(float installment) {
		this.installment = installment;
	}
	public String getFirstInstallmentDate() {
		return firstInstallmentDate;
	}
	public void setFirstInstallmentDate(String firstInstallmentDate) {
		this.firstInstallmentDate = firstInstallmentDate;
	}
	

}
