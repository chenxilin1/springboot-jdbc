package com.qhit.controller;

import com.qhit.pojo.User;
import com.qhit.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Resource
    UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "login";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model){
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        User user = new User(name,pwd);
        int i=userService.denglu(user);
        if(i==1){
            model.addAttribute("name",user.getName());
            return "success";
        }
        return "login";
    }
}
