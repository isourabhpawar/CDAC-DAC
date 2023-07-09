package com.app.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.dto.UserDTO;
import com.app.entities.UserRole;

@SpringBootTest
class UserServiceTest {
	@Autowired
	private UserService userService;

	@Test
	void testAddUser() {
		UserDTO dto = new UserDTO("Mithila", "Palkar", "mithila@gmail.com", "abcd#1234", UserRole.ROLE_CUSTOMER);
		UserDTO user = userService.registerNewUser(dto);
		assertEquals("Mithila", user.getFirstName());
	}

}
