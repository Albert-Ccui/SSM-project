package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Course;
import com.ssm.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseAction extends BaseAction{
	
	@Resource
	private CourseService courseService;
	@RequestMapping(value="/getAll")
	public ModelAndView getAll(HttpServletRequest request) throws Exception {
		System.out.println(request.getParameter("courseid"));
		List<Course> courseList = courseService.getAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("courseList", courseList);
		modelAndView.setViewName("coursemain");
        return modelAndView;
	}
	
	@RequestMapping(value="/addCourse")
	public String addInfo() throws Exception{
		return "forward:/addcourse.jsp";
	}
	
	@RequestMapping(value="/addcourse")
	public String addcourse(Course course) throws Exception{
		 courseService.addcourse(course);
		return "redirect:/index.jsp";		
	}
	
	@RequestMapping(value="/deleteCourse")
	public String deleteInfo(@RequestParam(value = "courseid", required = true) String courseid) throws Exception{
		courseService.deleteCourse(courseid);
		return "redirect:/index.jsp";		
	}
	
	@RequestMapping(value="/editCourse")
	public ModelAndView editCourse(@RequestParam(value = "courseid", required = true) String courseid) throws Exception{
		Course course=courseService.getOne(courseid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("course", course);
		modelAndView.setViewName("editcourse");
        return modelAndView;
	}
	
	@RequestMapping(value="/edit")
	public String edit(Course course) throws Exception{
		courseService.edit(course);
		return "redirect:/index.jsp";		
	}
}
