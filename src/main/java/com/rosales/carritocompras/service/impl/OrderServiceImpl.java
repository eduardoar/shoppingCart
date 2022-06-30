package com.rosales.carritocompras.service.impl;

import com.rosales.carritocompras.entity.Order;
import com.rosales.carritocompras.repository.OrderRepository;
import com.rosales.carritocompras.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> listAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order findOrder(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order Not Found"));
    }

    @Override
    public Order createOrder(Order order) {

        order.getOrderDetail().forEach(od -> {
            od.setOrder(order);
        });

        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

}
