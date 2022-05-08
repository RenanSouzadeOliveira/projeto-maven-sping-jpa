package com.renansouza.projetomavenspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansouza.projetomavenspringjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
