package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthRequest;
import com.app.dto.AuthResp;
import com.app.dto.UserDTO;
import com.app.jwt_utils.JwtUtils;
import com.app.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
//dep : service layer i/f
	@Autowired
	private UserService userService;

	// dep : auth mgr
	@Autowired
	private AuthenticationManager authMgr;

	// dep : jwt utils
	@Autowired
	private JwtUtils jwtUtils;

	// http://host:port/users/signup , method=POST
	@PostMapping("/signup")
	public ResponseEntity<?> signupUser(@RequestBody @Valid UserDTO dto) {
		System.out.println("in signup user " + dto);

		return ResponseEntity.status(HttpStatus.CREATED).body(userService.registerNewUser(dto));
	}

	// http://host:port/users/signin , method=POST
	@PostMapping("/signin")
	public ResponseEntity<?> signinUser(@RequestBody @Valid AuthRequest dto) {
		System.out.println("in signin user " + dto);
		// create instance of a token to hold un verified user creadentials
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(dto.getEmail(),
				dto.getPassword());
		System.out.println("auth obj before " + token);
		// invoke authenticate method of auth mgr
		Authentication verifiedPrincipal = authMgr.authenticate(token);
		System.out.println("principal " + verifiedPrincipal);
		// => auth successful --> create JWT n sent it to the clnt in auth resp.
		return ResponseEntity
				.ok(new AuthResp("Succeful Authentication !", jwtUtils.generateJwtToken(verifiedPrincipal)));
	}

}
