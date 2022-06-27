package com.rosales.carritocompras.service.impl;

import com.rosales.carritocompras.entity.PaymentMethod;
import com.rosales.carritocompras.repository.PaymentMethodRepository;
import com.rosales.carritocompras.service.PaymentMethodService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

    private final PaymentMethodRepository paymentMethodRepository;

    @Override
    public List<PaymentMethod> listAllPaymentMethod() {
        return paymentMethodRepository.findAll();
    }

    @Override
    public PaymentMethod findPaymentMethod(Long id) {
        return paymentMethodRepository.findById(id).orElseThrow(() -> new RuntimeException("Order Not Found"));
    }

    @Override
    public PaymentMethod createPaymentMethod(PaymentMethod paymentMethod) {
        return paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public PaymentMethod updatePaymentMethod(PaymentMethod paymentMethod) {
        return paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public void deletePaymentMethod(Long id) {
        paymentMethodRepository.deleteById(id);
    }

}
