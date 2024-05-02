package com.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootcrud.model.Friends;
import com.springbootcrud.serviceI.FriendServiceI;

@Controller
public class HomeController {
	
	@Autowired
	FriendServiceI fsi;

	@RequestMapping("/")
	public String firstPg() {
		return"loginPg";
	}
	
	@RequestMapping("/registerRequest")
	public String openRegister() {
		return "registerationPg";
	}
	
	@RequestMapping("/registrationProcess")
	public String saveData(@ModelAttribute Friends f) {
		System.out.println(f);
		fsi.save(f);
		return "loginPg";
	}
	
	@RequestMapping("/backToLogin")
	public String backtoLogin() {
		return"loginPg";
	}
	
	@RequestMapping("/log")
	public String loginCredentials(@RequestParam String username, @RequestParam String password, Model m) {
		List<Friends> list = fsi.checkCredentials(username, password);
		if(!list.isEmpty()) {
		m.addAttribute("data",list);
		return"successPg";
	}else {
		return "loginPg";
	}
	}	
}
