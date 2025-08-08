package com.mydomini.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomini.courseJava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
