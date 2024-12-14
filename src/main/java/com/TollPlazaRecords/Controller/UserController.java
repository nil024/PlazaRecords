package com.TollPlazaRecords.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TollPlazaRecords.Entity.Lane;
import com.TollPlazaRecords.Entity.LoginRequest;
import com.TollPlazaRecords.Entity.User;
import com.TollPlazaRecords.Services.UserService;

@Controller
public class UserController {
	
	
	@GetMapping("/")
    public String showHomePage() {
        return "index";
    }
	
	@GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
	
	@GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }
	
	@Autowired
	private UserService service;
	
	@PostMapping("/register/user")
	public ResponseEntity<?> adduser(@RequestBody User user) {
		
		try {
	        User savedUser = service.addUser(user);
	        return ResponseEntity.ok(savedUser);
	    } catch (IllegalArgumentException e) {
	        return ResponseEntity.badRequest().body(e.getMessage());
	    }
	}
	
	@PostMapping("/login/user")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginUser) {
        String userNameOrEmail = loginUser.getUsernameOrEmail();
        String password = loginUser.getPassword();

        // Call the UserService to check if user exists and if the password matches
        boolean isLoginSuccessful = service.UserLogin(userNameOrEmail, password);

        if (isLoginSuccessful) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

}
