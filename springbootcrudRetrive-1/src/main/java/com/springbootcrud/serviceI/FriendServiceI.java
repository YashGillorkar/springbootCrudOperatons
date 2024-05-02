package com.springbootcrud.serviceI;

import java.util.List;

import com.springbootcrud.model.Friends;

public interface FriendServiceI {

	public void save(Friends f);

	public List<Friends> checkCredentials(String username, String password);

}
