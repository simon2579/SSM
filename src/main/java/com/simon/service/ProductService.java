package com.simon.service;

import com.simon.pojo.Product;

import java.util.List;

public interface ProductService {

    int addProduct(Product product);

    int deleteProduct(int id);

    int updateProduct(Product product);

    Product getProduct(int id);

    List<Product> getAllProduct();
}
