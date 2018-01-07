package com.ssm.pojo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Techer implements Serializable{

	private String techid;
	private String techname;
	private String speciality;
	private String title;
	private String techcourse;
	
	public String getTechid() {
		return techid;
	}
	public void setTechid(String techid) {
		this.techid = techid;
	}
	public String getTechname() {
		return techname;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTechcourse() {
		return techcourse;
	}
	public void setTechcourse(String techcourse) {
		this.techcourse = techcourse;
	}
	
}
