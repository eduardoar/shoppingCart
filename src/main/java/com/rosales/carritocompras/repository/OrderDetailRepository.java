package com.rosales.carritocompras.repository;

import com.rosales.carritocompras.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {


}
