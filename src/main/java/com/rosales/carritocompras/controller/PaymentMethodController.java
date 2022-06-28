package com.rosales.carritocompras.controller;

import com.rosales.carritocompras.entity.PaymentMethod;
import com.rosales.carritocompras.service.PaymentMethodService;
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
@RequestMapping("/paymentMethods")
@Tag(name = "Payment Method")
public class PaymentMethodController {

    private final PaymentMethodService paymentMethodService;

    @Operation(summary = "Return List of all Payment Methods")
    @GetMapping
    public ResponseEntity<List<PaymentMethod>> listAllOrder() {
        return new ResponseEntity<>(paymentMethodService.listAllPaymentMethod(), HttpStatus.OK);
    }

    @Operation(summary = "Return Order By Id")
    @GetMapping("/{id}")
    public ResponseEntity<PaymentMethod> findOrder(@PathVariable Long id) {
        return new ResponseEntity<>(paymentMethodService.findPaymentMethod(id), HttpStatus.OK);
    }

    @Operation(summary = "Create Order")
    @PostMapping
    public ResponseEntity<PaymentMethod> createOrder(@RequestBody PaymentMethod paymentMethod) {
        return new ResponseEntity<>(paymentMethodService.createPaymentMethod(paymentMethod), HttpStatus.CREATED);
    }

    @Operation(summary = "Update Order")
    @PutMapping
    public ResponseEntity<PaymentMethod> updateOrder(@RequestBody PaymentMethod paymentMethod) {
        return new ResponseEntity<>(paymentMethodService.updatePaymentMethod(paymentMethod), HttpStatus.OK);
    }

    @Operation(summary = "Delete Order By Id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        paymentMethodService.deletePaymentMethod(id);
        return ResponseEntity.ok().build();
    }

}
