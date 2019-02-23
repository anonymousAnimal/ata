package com.ata.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ata.bean.ProfileBean;

@Component
public class InitController {

	@RequestMapping("/register")
	public String hello()
	{
		return"Register";
	}
	@RequestMapping("/loginpage")
	public String hello1()
	{
		return"login";
	}
	
	@RequestMapping("/doregister")
	public String hello2(ProfileBean profileBean, Model m)
	{
		String msg="";
		
		m.addAttribute("msg", msg);
		return "Profile";
	}
	
}
