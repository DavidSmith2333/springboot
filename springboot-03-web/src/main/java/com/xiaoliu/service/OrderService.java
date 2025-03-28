package com.xiaoliu.service;

import com.xiaoliu.pojo.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAll();

    //通过ID查询订单
    Order getOrderById(int id);

    //通过ID删除订单
    int delete(int id);

    //增加一个订单
    int save(Order order);

    int updateOrdById(Order order);
}
