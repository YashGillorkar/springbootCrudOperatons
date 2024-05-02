package com.springbootcrud.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.springbootcrud.model.Friends;
import com.springbootcrud.repository.FriendsRepository;
import com.springbootcrud.serviceI.FriendServiceI;

import jakarta.transaction.Transactional;

@Service
public class FriendsImpl implements FriendServiceI {

	@Autowired
	FriendsRepository fr;

	@Override
	public void save(Friends f) {
		fr.save(f);

	}

	@Override
	public List<Friends> checkCredentials(String username, String password) {
		if (username.equals("admin") && password.equals("admin")) {
			List<Friends> list = (List<Friends>) fr.findAll();
			return list;
		}
		return fr.findByUsernameAndPassword(username, password);
	}

	@Transactional
	@Modifying
	@Override
	public List<Friends> delete(String name) {
		System.out.println(name);
		fr.deleteByName(name);
		return (List<Friends>) fr.findAll();
		
	}

	@Override
	public Friends getDataByID(int id) {
		Optional<Friends> f = fr.findById(id);
		return f.get();
	}

	@Override
	public void updateData(Friends f) {
		fr.save(f);
		
	}
	
	

}
