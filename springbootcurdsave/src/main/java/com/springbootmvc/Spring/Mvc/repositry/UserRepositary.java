package com.springbootmvc.Spring.Mvc.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootmvc.Spring.Mvc.model.User;

@Repository
public interface UserRepositary extends CrudRepository<User, Integer> {

}
