package com.rosales.carritocompras.service;

import com.rosales.carritocompras.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {

    List<OrderDetail> listAllOrderDetail();

    OrderDetail findOrderDetail(Long id);

    OrderDetail createOrderDetail(OrderDetail orderDetail);

    OrderDetail updateOrderDetail(OrderDetail orderDetail);

    void deleteOrderDetail(Long id);

}
