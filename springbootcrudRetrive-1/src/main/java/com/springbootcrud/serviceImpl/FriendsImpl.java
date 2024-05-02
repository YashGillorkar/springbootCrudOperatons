package com.springbootcrud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcrud.model.Friends;
import com.springbootcrud.repository.FriendsRepository;
import com.springbootcrud.serviceI.FriendServiceI;

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

}
