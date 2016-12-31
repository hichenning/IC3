package cn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.com.model.User;
import cn.com.service.LoginService;
import cn.com.service.LoginServiceI;

@Controller
public class UserController{
	
	@Autowired
	private LoginServiceI ls;
	
	@RequestMapping("query")
	public ModelAndView query(@RequestParam(required=false) String name){
		System.out.println("usercontroller");
		ModelAndView md = new ModelAndView("success");
		User user = ls.query(name);
		md.addObject("user",user);
		return md;
	}
	
	
}
