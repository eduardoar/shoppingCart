package com.rosales.carritocompras.repository;

import com.rosales.carritocompras.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {

    @Query("from Cart where user.idUser = :id")
    List<Cart> findByUser(@Param("id") Long id);

}
