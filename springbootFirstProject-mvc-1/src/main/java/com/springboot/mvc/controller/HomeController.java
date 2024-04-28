package com.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


	@RequestMapping("/")
	public String preLogin() {
		System.out.println("in login page");
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginSuccess(@RequestParam String username, @RequestParam String password){
	System.out.println(username);
	System.out.println(password);
		return "success";
	}
}
