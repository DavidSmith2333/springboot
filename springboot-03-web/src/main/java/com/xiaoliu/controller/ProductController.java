package com.xiaoliu.controller;

import com.xiaoliu.pojo.Order;
import com.xiaoliu.pojo.Product;
import com.xiaoliu.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping("/products")
    public String listProduct(Model model) {
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "products/list";
    }

    @GetMapping("/product")
    public String toAdd(Model model) {
        //查出部门的所有信息
        List<Product> product = productService.getAll();
        model.addAttribute("order", product);
        return "products/add";
    }

    @PostMapping("/product")
    public String add(Product product) {
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/uppro/{id}")
    public String toupdataPro(@PathVariable("id") int id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);

        return "products/update";
//        return "order/list";
    }


    @PostMapping("/updatePro")
    public String updataPro(Product product) {
        productService.updateProById(product);
        return "redirect:/products";
    }

    //删除订单
    @GetMapping("/deletePro/{id}")
    public String deletePro(@PathVariable("id") int id) {
        productService.delete(id);
        return "redirect:/products";
    }

}
