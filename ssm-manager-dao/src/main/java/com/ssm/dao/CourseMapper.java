package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Course;

public interface CourseMapper extends BaseMapper<Course>{
	
	public List<Course> getAll();
	public void addcourse(Course course);
	public Course getOne(String courseid);
	public void edit(Course course);
	public void deleteCourse(String courseid);
}
