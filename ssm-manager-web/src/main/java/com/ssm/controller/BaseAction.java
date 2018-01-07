package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/base")
public class BaseAction {

	@Resource
	ServletContext application;

	
	@RequestMapping("/go/{file}")
	public String goURL( @PathVariable String file) {	
		return file;
	}

}
