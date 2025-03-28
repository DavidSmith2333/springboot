package com.xiaoliu.service;

import com.xiaoliu.mapper.ProductMapper;
import com.xiaoliu.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAll() {
        return productMapper.getAll();
    }

    @Override
    public Product getProductById(int id) {
        return productMapper.getProductById(id);
    }

    @Override
    public int delete(int id) {
        return productMapper.delete(id);
    }

    @Override
    public int save(Product product) {
        return productMapper.save(product);
    }

    @Override
    public int updateProById(Product product) {
        return productMapper.updateProById(product);
    }
}
