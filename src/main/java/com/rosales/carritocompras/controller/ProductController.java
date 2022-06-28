package com.rosales.carritocompras.controller;

import com.rosales.carritocompras.entity.Product;
import com.rosales.carritocompras.service.ProductService;
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
@RequestMapping("/products")
@Tag(name = "Product")
public class ProductController {

    private final ProductService productService;

    @Operation(summary = "Return List of All Products")
    @GetMapping
    public ResponseEntity<List<Product>> listAllProduct() {
        return new ResponseEntity<>(productService.listAllProducts(), HttpStatus.OK);
    }

    @Operation(summary = "Return Product By Id")
    @GetMapping("/{id}")
    public ResponseEntity<Product> findProduct(@PathVariable Long id) {
        return new ResponseEntity<>(productService.findProduct(id), HttpStatus.OK);
    }

    @Operation(summary = "Create Product")
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }

    @Operation(summary = "Update Product")
    @PutMapping
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.updateProduct(product), HttpStatus.OK);
    }

    @Operation(summary = "Delete Product By Id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok().build();
    }

}
