package cn.com.controller;

import java.util.List;

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
	public ModelAndView query(@RequestParam int id){
		System.out.println("usercontroller");
		ModelAndView md = new ModelAndView("success");
		List users = ls.query(id);
		md.addObject("users",users);
		return md;
	}
	@RequestMapping("save")
	public ModelAndView save(User user){
		System.out.println(user);
		ModelAndView md = new ModelAndView("success");
		ls.save(user);
		md.addObject("user",user);
		return md;
	}
	
	
}
