package com.app;

//import org.modelmapper.ModelMapper;
//import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.ModelMap;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();	}
	
//	@Bean // <bean id , class , scope ...../>
//	public ModelMapper myModelMapper() {
//		ModelMap mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		// set property matching convention between DTO n entity : as strict
//		return mapper; // config class method rets --> model mapper instance to SC --it will be managed
//						// as spring bean by SC
//	}

}
