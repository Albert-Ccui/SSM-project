package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Techer;
import com.ssm.service.TecherService;

@Controller
@RequestMapping("/techer")
public class TecherAction extends BaseAction{
	
	@Resource
	private TecherService techerService;
	@RequestMapping(value="/getAll")
	public ModelAndView getAll(HttpServletRequest request) throws Exception {
		List<Techer> techerList = techerService.getAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("techerList", techerList);
		modelAndView.setViewName("techermain");
        return modelAndView;
	}
	
	@RequestMapping(value="/addTecher")
	public String addTecher() throws Exception{
		return "forward:/addtecher.jsp";
	}
	
	@RequestMapping(value="/addtecher")
	public String addtecher(Techer techer) throws Exception{
		 techerService.addtecher(techer);
		return "redirect:/index.jsp";		
	}
	
	@RequestMapping(value="/deleteTecher")
	public String deleteTecher(@RequestParam(value = "techid", required = true) String techid) throws Exception{
		techerService.deleteTecher(techid);
		return "redirect:/index.jsp";		
	}
	
	@RequestMapping(value="/editTecher")
	public ModelAndView editTecher(@RequestParam(value = "techid", required = true) String techid) throws Exception{
		Techer techer=techerService.getOne(techid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("techer", techer);
		modelAndView.setViewName("edittecher");
        return modelAndView;
	}
	
	@RequestMapping(value="/edit")
	public String edit(Techer techer) throws Exception{
		techerService.edit(techer);
		return "redirect:/index.jsp";		
	}
}