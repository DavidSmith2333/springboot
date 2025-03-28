package com.xiaoliu.service;

import com.xiaoliu.mapper.IntegratedAnalyticsMapper;
import com.xiaoliu.pojo.IntegratedAnalytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegratedAnalyticsServiceImpl implements IntegratedAnalyticsService {

    @Autowired
    private IntegratedAnalyticsMapper integratedAnalyticsMapper;

    @Override
    public List<IntegratedAnalytics> getAll() {
        return integratedAnalyticsMapper.getAll();
    }

    @Override
    public IntegratedAnalytics getIntegratedAnalyticsById(int id) {
        return integratedAnalyticsMapper.getIntegratedAnalyticsById(id);
    }

    @Override
    public int delete(int id) {
        return integratedAnalyticsMapper.delete(id);
    }

    @Override
    public int save(IntegratedAnalytics integratedAnalytics) {
        return integratedAnalyticsMapper.save(integratedAnalytics);
    }

    @Override
    public int updateIntById(IntegratedAnalytics integratedAnalytics) {
        return integratedAnalyticsMapper.updateIntById(integratedAnalytics);
    }
}
