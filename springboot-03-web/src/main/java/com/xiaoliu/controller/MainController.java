package com.xiaoliu.controller;

import com.xiaoliu.pojo.Department;
import com.xiaoliu.pojo.Employee;
import com.xiaoliu.pojo.Order;
import com.xiaoliu.service.OrderServiceImpl;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private OrderServiceImpl orderService;

    @RequestMapping("/orders")
    public String listOrder(Model model) {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orders", orders);
        return "order/list";
    }

    @GetMapping("/order")
    public String toAdd(Model model) {
        //查出部门的所有信息
        List<Order> order = orderService.getAll();
        model.addAttribute("order", order);
        return "order/add";
    }

    @PostMapping("/order")
    public String add(Order order) {
        orderService.save(order);
        return "redirect:/orders";
    }

    @GetMapping("/upord/{id}")
    public String toupdataOrd(@PathVariable("id") int id, Model model) {
        Order order = orderService.getOrderById(id);
        model.addAttribute("order", order);
        return "order/update";
    }

//    @GetMapping("/to/{id}")
//    public String toupdataOrd(@PathVariable("id") int id,Model model){
//        Order order = orderService.getOrderById(id);
//        model.addAttribute("order",order);
//        return "order/update";
//    }

    @PostMapping("/updateOrd")
    public String updataOrd(Order order) {
        orderService.updateOrdById(order);
        return "redirect:/orders";
    }

    //删除订单
    @GetMapping("/deleteOrd/{id}")
    public String deleteEmp(@PathVariable("id") int id) {
        orderService.delete(id);
        return "redirect:/orders";
    }


    @RequestMapping("monthlyReports")
    public String listMonthlyReport(Model model) {

        return "monthlyReports/list";
    }

    @RequestMapping("quarterlyReports")
    public String listQuarterlyReport(Model model) {

        return "quarterlyReports/list";
    }

    @RequestMapping("societyRepercussions")
    public String listSocietyRepercussion(Model model) {

        return "societyRepercussions/list";
    }

    @RequestMapping("yearSales")
    public String listYearSales(Model model) {
        return "yearSales/list";
    }

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "registeredUsers";
    }

}
