package com.rosales.carritocompras.service;

import com.rosales.carritocompras.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product findProduct(Long id);

    Product createProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long id);

}
