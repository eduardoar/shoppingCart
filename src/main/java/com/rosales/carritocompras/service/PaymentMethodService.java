package com.rosales.carritocompras.service;

import com.rosales.carritocompras.entity.PaymentMethod;

import java.util.List;

public interface PaymentMethodService {

    List<PaymentMethod> listAllPaymentMethod();

    PaymentMethod findPaymentMethod(Long id);

    PaymentMethod createPaymentMethod(PaymentMethod paymentMethod);

    PaymentMethod updatePaymentMethod(PaymentMethod paymentMethod);

    void deletePaymentMethod(Long id);

}
