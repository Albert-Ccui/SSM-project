package com.ssm.pojo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Info implements Serializable{

	private String stuid;
	private String stuname;
	private String stusex;
	private String speciality;
	private String academe;
	private String grade;
	
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStusex() {
		return stusex;
	}
	public void setStusex(String stusex) {
		this.stusex = stusex;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getAcademe() {
		return academe;
	}
	public void setAcademe(String academe) {
		this.academe = academe;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
