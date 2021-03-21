package com.arctic.musicshop.controller;

import com.arctic.musicshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String Login(Model model, @RequestParam("username") String username, @RequestParam("password") int password, HttpSession session) {
        if (userService.getUser(username) != null) {
            if (userService.getPassWord(username) == password) {
                session.setAttribute("username", username);
                return "redirect:/shop.html";
            } else {
                model.addAttribute("msg", "密码错误");
                return "index";
            }
        } else {
            model.addAttribute("msg", "用户不存在");
            return "index";
        }
    }
}
