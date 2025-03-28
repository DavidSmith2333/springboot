package com.xiaoliu.controller;

import com.xiaoliu.pojo.Department;
import com.xiaoliu.pojo.Employee;
import com.xiaoliu.pojo.Report;
import com.xiaoliu.service.DepartmentServiceImpl;
import com.xiaoliu.service.ReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ReportController {

    @Autowired
    private ReportServiceImpl reportService;

    @RequestMapping("/reports")
    public String list(Model model) {
        List<Report> reports = reportService.getAll();
        model.addAttribute("reports", reports);
        return "report/list";
    }

    @GetMapping("/report")
    public String toAdd(Model model) {
        //查出部门的所有信息
        List<Report> report = reportService.getAll();
        model.addAttribute("report", report);
        return "report/add";
    }

    @PostMapping("/report")
    public String add(Report report) {
//        添加的操作
        reportService.save(report);
        return "redirect:/reports";
    }

    //去员工的修改页面
    @GetMapping("/uprep/{id}")
    public String toupdataRep(@PathVariable("id") int id, Model model) {
        //查出原来的数据
        Report report = reportService.getReportById(id);
        model.addAttribute("rep", report);

        return "report/update";
    }

    @PostMapping("/updateRep")
    public String updataRep(Report report) {
        reportService.updateRepById(report);
        return "redirect:/reports";
    }

    //删除员工
    @GetMapping("/deleteRep/{id}")
    public String deleteRep(@PathVariable("id") int id) {
        reportService.delete(id);
        return "redirect:/reports";
    }
}
