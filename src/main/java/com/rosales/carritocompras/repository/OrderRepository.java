package com.rosales.carritocompras.repository;

import com.rosales.carritocompras.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
