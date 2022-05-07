package com.renansouza.projetomavenspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansouza.projetomavenspringjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
