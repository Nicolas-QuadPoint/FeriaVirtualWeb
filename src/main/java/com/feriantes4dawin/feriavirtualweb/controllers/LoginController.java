package com.feriantes4dawin.feriavirtualweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String toLogin(Model model){
        
        return "/page-login";
    }

    @PostMapping("/login")
    public ModelAndView toHome (ModelAndView model){
        
        return new ModelAndView("redirect:/home");
    }

}
