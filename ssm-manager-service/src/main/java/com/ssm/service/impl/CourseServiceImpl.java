package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.CourseMapper;
import com.ssm.pojo.Course;
import com.ssm.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return courseMapper.getAll();
	}

	@Override
	public void addcourse(Course course) {
		// TODO Auto-generated method stub
		courseMapper.addcourse(course);
	}

	@Override
	public Course getOne(String courseid) {
		// TODO Auto-generated method stub
		return courseMapper.getOne(courseid);
	}

	@Override
	public void edit(Course course) {
		// TODO Auto-generated method stub
		courseMapper.edit(course);
	}

	@Override
	public void deleteCourse(String courseid) {
		// TODO Auto-generated method stub
		courseMapper.deleteCourse(courseid);
	}

}
