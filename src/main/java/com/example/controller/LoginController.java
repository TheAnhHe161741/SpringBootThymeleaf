package com.example.controller;

import ch.qos.logback.core.model.Model;
import com.example.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String getLoginForm() {
        System.out.println("123");
        return "login";
    }

    @RequestMapping(value = "/index")
    public String index() {
        System.out.println("123");
        return "index";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(@ModelAttribute("loginForm") LoginForm loginForm, Model model) {
//        String username = loginForm.getUsername();
//        String password = loginForm.getPasssword();
//        if ("admin".equals(username) && "123456".equals(password)) {
//            return "redirect:/home"; // Chuyển hướng sau khi đăng nhập thành công
//        }
//        model.addText("errorMessage");
//        return "redirect:/login"; // Chuyển hướng sau khi đăng nhập không thành công
//    }
}

