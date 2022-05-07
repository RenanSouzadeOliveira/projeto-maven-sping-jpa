package com.renansouza.projetomavenspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansouza.projetomavenspringjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
