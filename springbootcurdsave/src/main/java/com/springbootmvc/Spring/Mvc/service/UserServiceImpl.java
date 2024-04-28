package com.springbootmvc.Spring.Mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmvc.Spring.Mvc.model.User;
import com.springbootmvc.Spring.Mvc.repositry.UserRepositary;
import com.springbootmvc.Spring.Mvc.serviceI.UserServiceI;

@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	UserRepositary ur;
	
	@Override
	public void saveData(User u) {
		ur.save(u);
		
	}

}
