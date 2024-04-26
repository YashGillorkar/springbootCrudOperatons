package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.model.Student;
import com.project.serviceI.StudentServiceI;

@Controller
public class HomeController {

	@Autowired
	StudentServiceI ssi;

	@RequestMapping("/")
	public String first() {
		return "loginPg";
	}

	@RequestMapping("/reg")
	public String openRegister() {
		return "registerPg";
	}

	@RequestMapping("/registerForm")
	public String saveRegisterData(@ModelAttribute Student s) {
		ssi.saveData(s);
		return "loginPg";
	}
	
	@RequestMapping("/log")
	public String checkLogincredentials(@RequestParam String username, @RequestParam String password, Model m) {
		List<Student> list = ssi.checkWho(username, password);
		m.addAttribute("data" , list);
		return"success";
	}

}
