package com.TollPlazaRecords.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TollPlazaRecords.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    
    User findByEmail(String email);  // Find user by email
    User findByUsername(String username);  // Find user by username

}
