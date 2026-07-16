package com.example.sprignTest.product.data.repository;

import com.example.sprignTest.product.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
