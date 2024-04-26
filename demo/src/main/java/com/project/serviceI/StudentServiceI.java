package com.project.serviceI;

import java.util.List;

import com.project.model.Student;

public interface StudentServiceI {

	void saveData(Student s);

	List<Student> checkWho(String username, String password);

}
