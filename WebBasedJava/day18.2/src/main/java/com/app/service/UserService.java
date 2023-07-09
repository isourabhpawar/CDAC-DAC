package com.app.service;

import javax.validation.Valid;

import com.app.dto.UserDTO;

public interface UserService {

	UserDTO registerNewUser(UserDTO dto);

}
