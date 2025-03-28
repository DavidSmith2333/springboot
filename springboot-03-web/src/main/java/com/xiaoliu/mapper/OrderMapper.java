package com.xiaoliu.mapper;

import com.xiaoliu.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderMapper {

    //查询全部订单信息
    List<Order> getAll();

    //通过ID查询订单
    Order getOrderById(@Param("id") int id);

    //通过ID删除订单
    int delete(@Param("id") int id);

    //增加一个订单
    int save(Order order);

    //修改一个订单
    int updateOrdById(Order order);
}
