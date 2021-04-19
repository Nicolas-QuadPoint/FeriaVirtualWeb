package com.feriantes4dawin.feriavirtualweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String toLogin(Model model){
        
        return "/login";
    }

    @PostMapping("/login")
    public String toHome(Model model){
        
        return "/home";
    }

}
