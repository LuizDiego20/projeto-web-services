package com.luiz.projeto_web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.projeto_web_services.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}