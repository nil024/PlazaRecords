package com.TollPlazaRecords.Services;

import java.util.Optional;

import com.TollPlazaRecords.Entity.User;

public interface UserService {
	
	public User addUser(User user);
	
	public boolean UserLogin(String userNameOrEmail, String Password);
}
