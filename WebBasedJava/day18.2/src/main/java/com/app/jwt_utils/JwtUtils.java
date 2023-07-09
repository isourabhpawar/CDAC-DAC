package com.app.jwt_utils;

import java.security.Key;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.app.security.CustomUserDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JwtUtils {

	@Value("${SECRET_KEY}")
	private String jwtSecret;

	@Value("${EXP_TIMEOUT}")
	private int jwtExpirationMs;
	private Key key;

	@PostConstruct
	public void init() {
		key = Keys.hmacShaKeyFor(jwtSecret.getBytes());
	}

	// will be invoked by REST Controller(authentication controller) , upon
	// successful authentication
	public String generateJwtToken(Authentication authentication) {
		log.info("generate jwt token " + authentication);
		CustomUserDetails userPrincipal = 
				(CustomUserDetails) authentication.getPrincipal();
//JWT : userName,issued at ,exp date,digital signature(does not typically contain password , can contain authorities
		return Jwts.builder() // JWTs : a Factory class , used to create JWT tokens
				.setSubject((userPrincipal.getUsername())) // setting subject of the token(typically user name/email)
															// :sets
															// subject claim part of the token

				.setIssuedAt(new Date())// Sets the JWT Claims iat
										// (issued at) value of
										// current date
				.setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))// Sets the JWT Claims exp
																					// (expiration) value.
				.signWith(key, SignatureAlgorithm.HS512) // Signs the constructed JWT using the specified
															// algorithm with the specified key, producing a
															// JWS(Json web signature=signed JWT)

				// Using token signing algo : HMAC using SHA-512
				.compact();// Actually builds the JWT and serializes it to a compact, URL-safe string
	}

	// this method will be invoked by our custom filter
	public String getUserNameFromJwtToken(String token) {
		return Jwts.parserBuilder().
				setSigningKey(key).
				build().
				parseClaimsJws(token).
				getBody().
				getSubject();
	}

	// this method will be invoked by our custom filter
	public boolean validateJwtToken(String jwtToken) {
		try {
			Jwts.parserBuilder().setSigningKey(key).build().
			// Sets the signing key used to verify JWT digital signature.
					parseClaimsJws(jwtToken);// Parses the signed JWT returns the resulting Jws<Claims> instance
												// throws exc in case of failures in verification
			return true;
		} catch (Exception e) {
			log.error("Invalid JWT : " + e.getMessage());
		}

		return false;
	}
}
