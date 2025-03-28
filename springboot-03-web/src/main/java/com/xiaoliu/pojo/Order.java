package com.xiaoliu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//订单表
public class Order {
    private Integer id;
    private String orderName;
    private float orderPrice;
    private String orderPayTime;
    private String orderUrl;

    public Order() {
    }

    public Order(Integer id, String orderName, float orderPrice, String orderPayTime, String orderUrl) {
        this.id = id;
        this.orderName = orderName;
        this.orderPrice = orderPrice;
        this.orderPayTime = orderPayTime;
        this.orderUrl = orderUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(String orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                ", orderPrice=" + orderPrice +
                ", orderPayTime='" + orderPayTime + '\'' +
                ", orderUrl='" + orderUrl + '\'' +
                '}';
    }
}
