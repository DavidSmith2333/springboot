package com.xiaoliu.service;

import com.xiaoliu.pojo.Employee;
import com.xiaoliu.pojo.Report;

import java.util.List;

public interface ReportService {

    List<Report> getAll();

    //通过ID查询员工
    Report getReportById(int id);

    //通过ID删除员工
    int delete(int id);

    //增加一个员工
    int save(Report report);

    int updateRepById(Report report);

}
