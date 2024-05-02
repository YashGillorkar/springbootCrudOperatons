package com.springbootcrud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootcrud.model.Friends;
@Repository
public interface FriendsRepository extends CrudRepository<Friends, Integer>{
	
	public List<Friends> findByUsernameAndPassword(String username, String password);
	public void deleteByName(String name);

}
