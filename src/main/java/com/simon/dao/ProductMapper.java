package com.simon.dao;

import com.simon.pojo.Product;

import java.util.List;

public interface ProductMapper {

    int addProduct(Product product);

    int deleteProduct(int id);

    int updateProduct(Product product);

    Product getProduct(int id);

    List<Product> getAllProduct();
}
