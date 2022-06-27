package com.rosales.carritocompras.service;

import com.rosales.carritocompras.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> listAllOrder();

    Order findOrder(Long id);

    Order createOrder(Order order);

    Order updateOrder(Order order);

    void deleteOrder(Long id);

}
