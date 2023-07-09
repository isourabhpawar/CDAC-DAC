package com.app.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration//to tell SC taht cls level bean ,that following class is same as bean-config.xml
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)//enable method level auth rules
public class SpringSecConfig {
	
	@Autowired
	private PasswordEncoder enc;
	//configure bean for authenticate  in meomery auth : where user details are not persistent since stored in memory
//	@Bean
//	public InMemoryUserDetailsManager myAuthenticate() {
//		User admin=new User("sss",enc.encode("sss"),List.of(new SimpleGrantedAuthority("ROLE_ADMIN")));
//		
//		User cust1=new User("aaa",enc.encode("aaa"),List.of(new SimpleGrantedAuthority("ROLE_CUSTOMER")));
//		User cust2=new User("zzz",enc.encode("zzz"),List.of(new SimpleGrantedAuthority("ROLE_CUSTOMER")));
//		return new InMemoryUserDetailsManager(admin,cust1,cust2);
//	}
	
	
	
	
	
	@Bean
	public SecurityFilterChain myAuthorization(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests()
		.antMatchers("/product/view").permitAll()
		.antMatchers("/products/purchase").hasRole("CUSTOMER")
		.antMatchers("/products/add").hasRole("ADMIN")
		.anyRequest()//any other remainig requests must be
		.authenticated()//authenticated
		.and()//bridge
		.httpBasic();//support still the basic Auth type
		return http.build();
		
	}
	//configure nother bean for authorization
	
	
	
	

}
