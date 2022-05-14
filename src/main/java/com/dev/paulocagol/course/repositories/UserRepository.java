package com.dev.paulocagol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.paulocagol.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
