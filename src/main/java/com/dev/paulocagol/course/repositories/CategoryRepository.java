package com.dev.paulocagol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.paulocagol.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
