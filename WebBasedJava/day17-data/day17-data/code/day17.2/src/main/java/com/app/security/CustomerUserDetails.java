package com.app.security;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.repository.UserRepo;
@Service
@Transactional
public class CustomerUserDetails implements UserDetailsService{
	@Autowired
	private UserRepo userRepo;
	@Override
	
	
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		
		
		return userRepo.findByEmail(email).orElseThrow(()->new UsernameNotFoundException("email doesnot exists"));
	}

}
