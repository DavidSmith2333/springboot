package com.xiaoliu.controller;

import com.xiaoliu.pojo.User;
import com.xiaoliu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


//    @RequestMapping("/user/login")
//    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model,
//                        HttpSession session){
//
//        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
//            session.setAttribute("loginUser",username);
//            return "redirect:/main.html";
//        }else {
//            model.addAttribute("msg","用户名或者密码错误");
//            return "index";
//        }
//    }

    @Autowired
    private UserService userService;

    @RequestMapping("/user/login")
    public String login(String username, String password, Model model, HttpSession session) {
        User user = userService.login(username, password);

        if (user != null) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }
    }

    @RequestMapping("/user/loginOut")
    public String loginOut(HttpSession session) {
        session.invalidate();
        return "redirect:/index";
    }

    /*
     @RequestMapping("/user/login")
    public  String login(String username,String password,Model model){



        //获得当前的用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户的登录数据
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);

        try {
            subject.login(usernamePasswordToken);   //执行登录的方法,如果没有异常 就说明ok
            return "dashboard";
        } catch (UnknownAccountException e) {   //用户名不存在
            model.addAttribute("msg","用户名错误");
            return "index";
        } catch (IncorrectCredentialsException e) { //密码不存在
            model.addAttribute("msg","密码错误");
            return "index";
        }
    }
     */

    //跳转到创建用户界面
    @RequestMapping("/toAddUser")
    public String toAddUser() {
        return "registeredUsers";
    }


    @RequestMapping("/addUser")
    //创建新用户
    public String addUser(User user, Model model) {
        // 验证用户名不为空
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            model.addAttribute("msg", "用户名不能为空");
            return "registeredUsers";
        }
        
        // 验证密码不为空
        if (user.getPwd() == null || user.getPwd().trim().isEmpty()) {
            model.addAttribute("msg", "密码不能为空");
            return "registeredUsers";
        }
        
        // 检查用户名是否已存在
        User existingUser = userService.findUserByName(user.getName());
        if (existingUser != null) {
            model.addAttribute("msg", "用户名已存在，请选择其他用户名");
            return "registeredUsers";
        }
        
        // 添加用户
        int result = userService.addUser(user);
        if (result > 0) {
            System.out.println("addUser -> " + user);
            return "index";
        } else {
            model.addAttribute("msg", "注册失败，请稍后再试");
            return "registeredUsers";
        }
    }

    @RequestMapping("/user/deleteAccount")
    public String deleteAccount(HttpSession session, Model model) {
        String username = (String) session.getAttribute("loginUser");
        if (username != null) {
            int result = userService.deleteUser(username);
            if (result > 0) {
                // 注销成功,清除session
                session.invalidate();
                return "redirect:/index?msg=accountDeleted";
            }
        }
        model.addAttribute("msg", "注销失败");
        return "dashboard";
    }

}
