package com.mydomini.courseJava.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mydomini.courseJava.entities.User;
import com.mydomini.courseJava.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Matheus", "matheus@gmail.com", "11923445577", "12345");
		User u2 = new User(null, "Larissa", "larissa@gmail.com", "11923557799", "54321");
		User u3 = new User(null, "Caleri", "caleri@gmail.com", "11923667733", "12354");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		
	}
	
	
	
}
