package com.mydomini.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomini.courseJava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
