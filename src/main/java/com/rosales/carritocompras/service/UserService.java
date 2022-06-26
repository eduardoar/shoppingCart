package com.rosales.carritocompras.service;

import com.rosales.carritocompras.entity.User;

import java.util.List;

public interface UserService {

    List<User> listAllUsers();

    User findUser(Long id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);

}
