package com.xiaoliu.service;

import com.xiaoliu.mapper.OrderMapper;
import com.xiaoliu.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getAll() {
        return orderMapper.getAll();
    }

    @Override
    public Order getOrderById(int id) {
        return orderMapper.getOrderById(id);
    }

    @Override
    public int delete(int id) {
        return orderMapper.delete(id);
    }

    @Override
    public int save(Order order) {
        return orderMapper.save(order);
    }

    @Override
    public int updateOrdById(Order order) {
        return orderMapper.updateOrdById(order);
    }
}
