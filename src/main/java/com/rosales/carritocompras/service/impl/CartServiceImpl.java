package com.rosales.carritocompras.service.impl;

import com.rosales.carritocompras.entity.Cart;
import com.rosales.carritocompras.repository.CartRepository;
import com.rosales.carritocompras.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public List<Cart> listAllCart() {
        return cartRepository.findAll();
    }

    @Override
    public Cart findCart(Long id) {
        return cartRepository.findById(id).orElseThrow(() -> new RuntimeException("Cart Not Found"));
    }

    @Override
    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public List<Cart> findCartByUser(Long id) {
        return cartRepository.findByUser(id);
    }

}
