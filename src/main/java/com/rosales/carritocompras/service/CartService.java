package com.rosales.carritocompras.service;

import com.rosales.carritocompras.entity.Cart;

import java.util.List;

public interface CartService {

    List<Cart> listAllCart();

    Cart findCart(Long id);

    Cart createCart(Cart cart);

    Cart updateCart(Cart cart);

    void deleteCart(Long id);

    List<Cart> findCartByUser(Long id);

}
