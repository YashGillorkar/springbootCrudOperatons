package com.springbootcrud.serviceI;

import java.util.List;

import com.springbootcrud.model.Friends;

public interface FriendServiceI {

	public void save(Friends f);

	public List<Friends> checkCredentials(String username, String password);

	public List<Friends> delete(String name);

	public Friends getDataByID(int id);

	public void updateData(Friends f);

}
