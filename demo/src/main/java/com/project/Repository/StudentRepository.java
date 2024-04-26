package com.project.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	List<Student> findByUsernameAndPassword(String username, String password);

}
