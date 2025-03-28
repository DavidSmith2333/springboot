package com.xiaoliu.service;

import com.xiaoliu.pojo.IntegratedAnalytics;
import com.xiaoliu.pojo.Order;

import java.util.List;

public interface IntegratedAnalyticsService {

    List<IntegratedAnalytics> getAll();

    //通过ID查询订单
    IntegratedAnalytics getIntegratedAnalyticsById(int id);

    //通过ID删除订单
    int delete(int id);

    //增加一个订单
    int save(IntegratedAnalytics integratedAnalytics);

    int updateIntById(IntegratedAnalytics integratedAnalytics);

}
