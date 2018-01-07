package com.ssm.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Info;
import com.ssm.pojo.User;
import com.ssm.service.InfoService;
import com.ssm.service.UserService;


@Controller
@RequestMapping("/user")
public class UserAction extends BaseAction {
	
	@Resource
	private UserService userService;
	/*@RequestMapping("/go/{file}")
	public String goURL( @PathVariable String file) {	
		return file;
	}*/
	@RequestMapping(value="/login")
	public String login(User user,HttpServletRequest request,HttpSession session){
		System.out.println("---action.user:"+user);
		User acc= userService.login(user);
		if(acc!=null){
			session.setAttribute("user", acc);
			return "redirect:/user/go/index.action";
		}else{
			request.setAttribute("msg", "用户名或密码错误！");
			return "forward:/user/go/login.action";
		}
	}
	
	@Resource
	private InfoService infoService;
	@RequestMapping(value="/getAll")
	public ModelAndView getAll(HttpServletRequest request) throws Exception {
		System.out.println(request.getParameter("stuid"));
		List<Info> infoList = infoService.getAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("infoList", infoList);
		modelAndView.setViewName("main");
        return modelAndView;
	}
	
	@RequestMapping(value="/addInfo")
	public String addInfo() throws Exception{
		return "forward:/user/go/addinfo.action";
	}
	
	@RequestMapping(value="/add")
	public String add(Info info) throws Exception{
		 System.out.println("用户注册："+info.getStuname()+info.getAcademe()); 
		 infoService.add(info);
		return "redirect:user/go/index.action";		
	}
	
	@RequestMapping(value="/editInfo")
	public ModelAndView editInfo(@RequestParam(value = "stuid", required = true) String stuid) throws Exception{
		System.out.println(stuid);
		Info info=infoService.getOne(stuid);
		System.out.println(info);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("info", info);
		modelAndView.setViewName("editinfo");
        return modelAndView;
	}
	
	@RequestMapping(value="/edit")
	public String edit(Info info) throws Exception{
		infoService.edit(info);
		return "redirect:/user/go/index.action";		
	}
	
	@RequestMapping(value="/deleteInfo")
	public String deleteInfo(@RequestParam(value = "stuid", required = true) String stuid) throws Exception{
		System.out.println(stuid);
		infoService.deleteInfo(stuid);
		return "redirect:/user/go/index.action";		
	}
}
