package com.xiaoliu.service;

import com.xiaoliu.mapper.DepartmentMapper;
import com.xiaoliu.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAll() {
        return departmentMapper.getAll();
    }


}
