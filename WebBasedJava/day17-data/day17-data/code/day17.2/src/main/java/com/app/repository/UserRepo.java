package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.app.entities.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Long> {

	Optional<UserDetails> findByEmail(String email);
		
	

}
