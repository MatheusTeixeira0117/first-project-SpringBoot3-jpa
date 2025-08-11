package com.mydomini.courseJava.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mydomini.courseJava.entities.Category;
import com.mydomini.courseJava.entities.Order;
import com.mydomini.courseJava.entities.Product;
import com.mydomini.courseJava.entities.User;
import com.mydomini.courseJava.entities.enums.OrderStatus;
import com.mydomini.courseJava.repositories.CategoryRepository;
import com.mydomini.courseJava.repositories.OrderRepository;
import com.mydomini.courseJava.repositories.ProductRepository;
import com.mydomini.courseJava.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository catogoryRespository;

	@Autowired
	private ProductRepository productRespository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers"); 

		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		
		catogoryRespository.saveAll(Arrays.asList(cat1,cat2,cat3));
		productRespository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		User u1 = new User(null, "Matheus", "matheus@gmail.com", "11923445577", "12345");
		User u2 = new User(null, "Larissa", "larissa@gmail.com", "11923557799", "54321");
		User u3 = new User(null, "Caleri", "caleri@gmail.com", "11923667733", "12354");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WATING_PAYMENT, u3);
		Order o3 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WATING_PAYMENT, u2);
		Order o4 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, u1); 
		
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4));
		
	}
	
	
	
}
