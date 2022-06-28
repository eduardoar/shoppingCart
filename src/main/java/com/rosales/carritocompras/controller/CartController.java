package com.rosales.carritocompras.controller;

import com.rosales.carritocompras.entity.Cart;
import com.rosales.carritocompras.service.CartService;
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
@RequestMapping("/carts")
@Tag(name = "Cart")
public class CartController {

    private final CartService cartService;

    @Operation(summary = "Return List of all shopping carts")
    @GetMapping
    public ResponseEntity<List<Cart>> listAllCart() {
        return new ResponseEntity<>(cartService.listAllCart(), HttpStatus.OK);
    }

    @Operation(summary = "Return Cart By Id")
    @GetMapping("/{id}")
    public ResponseEntity<Cart> findCart(@PathVariable Long id) {
        return new ResponseEntity<>(cartService.findCart(id), HttpStatus.OK);
    }

    @Operation(summary = "Return Carts By User")
    @GetMapping("/user/{id}")
    public ResponseEntity<List<Cart>> findCartByUser(@PathVariable Long id) {
        return new ResponseEntity<>(cartService.findCartByUser(id), HttpStatus.OK);
    }

    @Operation(summary = "Create new Cart")
    @PostMapping
    public ResponseEntity<Cart> createCart(@RequestBody Cart cart) {
        return new ResponseEntity<>(cartService.createCart(cart), HttpStatus.CREATED);
    }

    @Operation(summary = "Update Cart")
    @PutMapping
    public ResponseEntity<Cart> updateCart(@RequestBody Cart cart) {
        return new ResponseEntity<>(cartService.updateCart(cart), HttpStatus.OK);
    }

    @Operation(summary = "Delete Cart")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
        return ResponseEntity.ok().build();
    }

}
