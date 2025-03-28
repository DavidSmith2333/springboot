package com.xiaoliu.service;

import com.xiaoliu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAll();

    //通过ID查询员工
    Employee getEmployeeById(int id);

    //通过ID删除员工
    int delete(int id);

    //增加一个员工
    int save(Employee employee);

    int updateEmpById(Employee employee);

    Employee queryEmployeeByName(String ename);
}
