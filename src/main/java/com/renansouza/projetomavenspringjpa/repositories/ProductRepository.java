package com.renansouza.projetomavenspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansouza.projetomavenspringjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
