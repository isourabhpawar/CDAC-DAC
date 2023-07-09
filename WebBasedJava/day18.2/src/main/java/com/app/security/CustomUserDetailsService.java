package com.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.UserEntity;
import com.app.repository.UserEntityRepository;

//user details service to provide user details lifted from DB
@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {
	// dep : user ent repo
	@Autowired
	private UserEntityRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// get user details by email , using UserEntityRepo.
		UserEntity user = userRepo.findByEmail(email)
				.orElseThrow(() -> 
				new UsernameNotFoundException("Email does not exist!!!!"));
		//user : persistent --> map it to UserDetails instance
		return new CustomUserDetails(user);
	}

}
