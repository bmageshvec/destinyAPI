package com.app.destiny.dao;

import com.app.destiny.model.AppUser;

public interface UserDetailsDao {
	
	
	public AppUser getUserById(int userId);
	
	public int getTotalUser();
	

}
