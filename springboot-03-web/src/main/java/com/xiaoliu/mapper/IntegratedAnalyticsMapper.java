package com.xiaoliu.mapper;

import com.xiaoliu.pojo.IntegratedAnalytics;
import com.xiaoliu.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IntegratedAnalyticsMapper {
    //查询全部订单信息
    List<IntegratedAnalytics> getAll();

    //通过ID查询订单
    IntegratedAnalytics getIntegratedAnalyticsById(@Param("id") int id);

    //通过ID删除订单
    int delete(@Param("id") int id);

    //增加一个订单
    int save(IntegratedAnalytics integratedAnalytics);

    //修改一个订单
    int updateIntById(IntegratedAnalytics integratedAnalytics);
}
