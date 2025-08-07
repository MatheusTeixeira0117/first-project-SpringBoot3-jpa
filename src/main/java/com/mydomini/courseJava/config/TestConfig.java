package com.mydomini.courseJava.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mydomini.courseJava.entities.Order;
import com.mydomini.courseJava.entities.User;
import com.mydomini.courseJava.repositories.OrderRepository;
import com.mydomini.courseJava.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Matheus", "matheus@gmail.com", "11923445577", "12345");
		User u2 = new User(null, "Larissa", "larissa@gmail.com", "11923557799", "54321");
		User u3 = new User(null, "Caleri", "caleri@gmail.com", "11923667733", "12354");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u3);
		Order o3 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o4 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1); 
		
		
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4));
		
	}
	
	
	
}
