package com.TollPlazaRecords.ServicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TollPlazaRecords.Entity.User;
import com.TollPlazaRecords.Repository.UserRepository;
import com.TollPlazaRecords.Services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User addUser(User user) {

		if (repository.existsByEmail(user.getEmail())) {
			throw new IllegalArgumentException("A user with this email already exists.");
		}

		if (repository.existsByUsername(user.getUsername())) {
			throw new IllegalArgumentException("A user with this username already exists.");
		}

		User user2 = repository.save(user);

		return user2;
	}

	@Override
	public boolean UserLogin(String userNameOrEmail, String Password) {
		
		User user = null;
	    if (userNameOrEmail.contains("@")) {
	        user = repository.findByEmail(userNameOrEmail);
	    } else {
	        user = repository.findByUsername(userNameOrEmail);
	    }

	    if (user != null && user.getPassword().equals(Password)) {
	        return true;
	    }

	    return false;
	}

}
