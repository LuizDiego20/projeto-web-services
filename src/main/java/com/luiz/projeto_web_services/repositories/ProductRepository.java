package com.luiz.projeto_web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.projeto_web_services.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}