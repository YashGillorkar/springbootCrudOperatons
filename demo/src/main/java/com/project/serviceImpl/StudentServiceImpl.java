package com.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.StudentRepository;
import com.project.model.Student;
import com.project.serviceI.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	StudentRepository sr;
	
	@Override
	public void saveData(Student s) {
		sr.save(s);
		
	}

	@Override
	public List<Student> checkWho(String username, String password) {
		if(username.equals("admin") && password.equals("admin")) {
			return (List<Student>) sr.findAll();
		}else {
			List<Student> list2 = sr.findByUsernameAndPassword(username, password);
			return list2;
		}
		
	}
	
	

}
