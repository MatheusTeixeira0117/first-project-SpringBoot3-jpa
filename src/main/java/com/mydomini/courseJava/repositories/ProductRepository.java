package com.mydomini.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomini.courseJava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
