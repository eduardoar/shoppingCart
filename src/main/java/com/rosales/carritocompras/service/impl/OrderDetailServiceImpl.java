package com.rosales.carritocompras.service.impl;

import com.rosales.carritocompras.entity.OrderDetail;
import com.rosales.carritocompras.repository.OrderDetailRepository;
import com.rosales.carritocompras.service.OrderDetailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetail> listAllOrderDetail() {
        return orderDetailRepository.findAll();
    }

    @Override
    public OrderDetail findOrderDetail(Long id) {
        return orderDetailRepository.findById(id).orElseThrow(() -> new RuntimeException("OrderDetail Not Found"));
    }

    @Override
    public OrderDetail createOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public OrderDetail updateOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public void deleteOrderDetail(Long id) {
        orderDetailRepository.deleteById(id);
    }

}
