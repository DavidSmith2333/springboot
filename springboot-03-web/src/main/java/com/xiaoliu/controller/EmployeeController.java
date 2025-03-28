package com.xiaoliu.controller;

import com.xiaoliu.service.EmployeeServiceImpl;
import com.xiaoliu.pojo.Department;
import com.xiaoliu.pojo.Employee;
import com.xiaoliu.service.DepartmentServiceImpl;
import com.xiaoliu.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @Autowired
    private EmployeeServiceImpl employeeService;

    @RequestMapping("/emps")
    public String list(Model model) {
        List<Employee> employees = employeeService.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }


//    @GetMapping("/query/{employeeName}")
//    public String queryEmployee(@PathVariable("employeeName") String employeeName, Model model) {
//        Employee employee = employeeService.queryEmployeeByName(employeeName);
//        model.addAttribute("e",employee);
//
//        System.out.println("queryEmployee --> " + employee);
//
//
//        List<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(employee);
//
//        if (employee == null){
//            employeeList = employeeService.getAll();
//        }
//
//        model.addAttribute("employeeList",employeeList);
//
//        return "emp/list";
//    }


    @GetMapping("/emp")
    public String toAdd(Model model) {
        //查出部门的所有信息
        List<Department> departments = departmentService.getAll();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String add(Employee employee) {
//        添加的操作
        employeeService.save(employee);
        return "redirect:/emps";
    }

    //去员工的修改页面
    @GetMapping("/upemp/{id}")
    public String toupdataEmp(@PathVariable("id") int id, Model model) {
        //查出原来的数据
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("emp", employee);

        List<Department> departments = departmentService.getAll();
        model.addAttribute("departments", departments);

        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String updataEmp(Employee employee) {
        employeeService.updateEmpById(employee);
        return "redirect:/emps";
    }

    //删除员工
    @GetMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable("id") int id) {
        employeeService.delete(id);
        return "redirect:/emps";
    }

//    @GetMapping("/queryEmp/{id}")
//    public String toqueryEmp(@PathVariable("id") int id){
//        employeeService.getEmployeeById(id);
//
//        return "redirect:/emps";
//    }

//    @PostMapping("/queryEmployee")
//    public String queryEmployee(int id) {
//        Employee employee = employeeService.getEmployeeById(id);
//        List<Employee> employeeList = new ArrayList<Employee>();
//
//        employeeList.add(employee);
//
//        return "emp/list";
//    }

    @RequestMapping("/queryEmployee")
    public String queryEmployee(@RequestParam("ename") String ename, Model model) {
        Employee employee = employeeService.queryEmployeeByName(ename);
        System.out.println("queryEmployee --> " + employee);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee);

        model.addAttribute("employeeList", employeeList);

        return "emp/lists";


    }


}
