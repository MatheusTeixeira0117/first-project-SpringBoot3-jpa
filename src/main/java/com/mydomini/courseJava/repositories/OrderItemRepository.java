package com.mydomini.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydomini.courseJava.entities.OrderItem;
import com.mydomini.courseJava.entities.PK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
