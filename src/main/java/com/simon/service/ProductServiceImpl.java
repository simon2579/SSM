package com.simon.service;

import com.simon.dao.ProductMapper;
import com.simon.pojo.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private ProductMapper productMapper;

    public ProductMapper getProductMapper() {
        return productMapper;
    }

    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public int addProduct(Product product) {
        return productMapper.addProduct(product);
    }

    public int deleteProduct(int id) {
        return productMapper.deleteProduct(id);
    }

    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }

    public Product getProduct(int id) {
        return productMapper.getProduct(id);
    }

    public List<Product> getAllProduct() {
        return productMapper.getAllProduct();
    }
}
