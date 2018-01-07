package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Course;

public interface CourseService {
	public List<Course> getAll();
	public void addcourse(Course course);
	public Course getOne(String courseid);
	public void edit(Course course);
	public void deleteCourse(String courseid);
}
