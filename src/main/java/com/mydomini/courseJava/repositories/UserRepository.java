package com.mydomini.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomini.courseJava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
