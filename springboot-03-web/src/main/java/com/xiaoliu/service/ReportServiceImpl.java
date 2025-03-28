package com.xiaoliu.service;

import com.xiaoliu.mapper.ReportMapper;
import com.xiaoliu.pojo.Employee;
import com.xiaoliu.pojo.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportMapper reportMapper;


    @Override
    public List<Report> getAll() {
        return reportMapper.getAll();
    }

    @Override
    public Report getReportById(int id) {
        return reportMapper.getReportById(id);
    }

    @Override
    public int delete(int id) {
        return reportMapper.delete(id);
    }

    @Override
    public int save(Report report) {
        return reportMapper.save(report);
    }

    @Override
    public int updateRepById(Report report) {
        return reportMapper.updateRepById(report);
    }


}
