package com.xiaoliu.controller;

import com.xiaoliu.pojo.IntegratedAnalytics;
import com.xiaoliu.pojo.Order;
import com.xiaoliu.service.IntegratedAnalyticsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IntegratedAnalyticsController {

    @Autowired
    private IntegratedAnalyticsServiceImpl integratedAnalyticsService;


    @RequestMapping("/integratedAnalyticss")
    public String listIntegratedAnalytics(Model model) {
        List<IntegratedAnalytics> integratedAnalyticss = integratedAnalyticsService.getAll();
        model.addAttribute("integratedAnalyticss", integratedAnalyticss);
        return "integratedAnalytics/list";
    }

    @GetMapping("/integratedAnalytics")
    public String toAdd(Model model) {
        //查出部门的所有信息
        List<IntegratedAnalytics> integratedAnalytics = integratedAnalyticsService.getAll();
        model.addAttribute("integratedAnalytics", integratedAnalytics);
        return "integratedAnalytics/add";
    }

    @PostMapping("/integratedAnalytics")
    public String add(IntegratedAnalytics integratedAnalytics) {
        integratedAnalyticsService.save(integratedAnalytics);
        return "redirect:/integratedAnalyticss";
    }

    @GetMapping("/upint/{id}")
    public String toupdataInt(@PathVariable("id") int id, Model model) {
        IntegratedAnalytics integratedAnalytics = integratedAnalyticsService.getIntegratedAnalyticsById(id);
        model.addAttribute("integratedAnalytics", integratedAnalytics);

        return "integratedAnalytics/update";
    }

    @PostMapping("/updateInt")
    public String updataInt(IntegratedAnalytics integratedAnalytics) {
        integratedAnalyticsService.updateIntById(integratedAnalytics);
        return "redirect:/integratedAnalyticss";
    }

    //删除订单
    @GetMapping("/deleteInt/{id}")
    public String deleteEmp(@PathVariable("id") int id) {
        integratedAnalyticsService.delete(id);
        return "redirect:/integratedAnalytics";
    }
}
