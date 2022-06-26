package com.rosales.carritocompras.repository;

import com.rosales.carritocompras.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
