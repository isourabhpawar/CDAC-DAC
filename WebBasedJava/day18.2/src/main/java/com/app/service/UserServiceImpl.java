package com.app.service;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.UserDTO;
import com.app.entities.UserEntity;
import com.app.repository.UserEntityRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	// dep : user dao
	@Autowired
	private UserEntityRepository userRepo;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private PasswordEncoder enc;

	@Override
	public UserDTO registerNewUser(UserDTO dto) {
		// dto --> entity
		UserEntity userEntity = mapper.map(dto, UserEntity.class);
		// encode passdword
		userEntity.setPassword(enc.encode(userEntity.getPassword()));
		//save 
		UserEntity persistentEntity = userRepo.save(userEntity);
		return mapper.map(persistentEntity, UserDTO.class);
	}

}
