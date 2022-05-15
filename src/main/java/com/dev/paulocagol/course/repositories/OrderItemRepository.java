package com.dev.paulocagol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.paulocagol.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
