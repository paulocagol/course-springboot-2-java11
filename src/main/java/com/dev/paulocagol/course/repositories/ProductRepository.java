package com.dev.paulocagol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.paulocagol.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
