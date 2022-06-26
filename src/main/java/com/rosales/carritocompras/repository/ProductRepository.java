package com.rosales.carritocompras.repository;

import com.rosales.carritocompras.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
