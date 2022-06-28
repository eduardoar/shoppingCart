package com.rosales.carritocompras.controller;

import com.rosales.carritocompras.entity.Order;
import com.rosales.carritocompras.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/orders")
@Tag(name = "Order")
public class OrderController {

    private final OrderService orderService;

    @Operation(summary = "Return List of all Orders")
    @GetMapping
    public ResponseEntity<List<Order>> listAllOrder() {
        return new ResponseEntity<>(orderService.listAllOrder(), HttpStatus.OK);
    }

    @Operation(summary = "Return Order By Id")
    @GetMapping("/{id}")
    public ResponseEntity<Order> findOrder(@PathVariable Long id) {
        return new ResponseEntity<>(orderService.findOrder(id), HttpStatus.OK);
    }

    @Operation(summary = "Create Order")
    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.createOrder(order), HttpStatus.CREATED);
    }

    @Operation(summary = "Update Order")
    @PutMapping
    public ResponseEntity<Order> updateOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.updateOrder(order), HttpStatus.OK);
    }

    @Operation(summary = "Delete Order By Id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.ok().build();
    }

}
