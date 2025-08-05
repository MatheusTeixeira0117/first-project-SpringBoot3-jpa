package com.mydomini.courseJava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydomini.courseJava.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> fingAll(){
		User u = new User(1L, "Maria", "maria@hgmail.com", "99999999","12345");
		return ResponseEntity.ok().body(u);
	}
}
