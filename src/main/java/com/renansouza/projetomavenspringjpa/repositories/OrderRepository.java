package com.renansouza.projetomavenspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansouza.projetomavenspringjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
