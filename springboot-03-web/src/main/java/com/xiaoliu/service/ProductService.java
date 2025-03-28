package com.xiaoliu.service;


import com.xiaoliu.pojo.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    //通过ID查询员工
    Product getProductById(int id);

    //通过ID删除员工
    int delete(int id);

    //增加一个员工
    int save(Product product);

    int updateProById(Product product);

}
