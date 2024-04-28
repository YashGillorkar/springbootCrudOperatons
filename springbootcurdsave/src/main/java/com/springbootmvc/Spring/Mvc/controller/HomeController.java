package com.springbootmvc.Spring.Mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootmvc.Spring.Mvc.model.User;
import com.springbootmvc.Spring.Mvc.serviceI.UserServiceI;

@Controller
public class HomeController {
	
	@Autowired
	UserServiceI usi;
	
	@RequestMapping("/")
	public String prelogin() {
		return "login";
	}
	
	@RequestMapping("/registerPg")
	public String registationPg() {
		
		return "register";
	}
	
	@RequestMapping("/registerSuccess")
	public String registerDisplay(@ModelAttribute  User u , Model m) {
		usi.saveData(u);
		m.addAttribute("data","Data Added Succsufully" );
		return "success";
	}
}
