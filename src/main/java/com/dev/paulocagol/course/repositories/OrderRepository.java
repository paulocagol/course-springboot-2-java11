package com.dev.paulocagol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.paulocagol.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
