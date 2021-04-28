package com.feriantes4dawin.feriavirtualweb.controllers;

import com.feriantes4dawin.feriavirtualweb.models.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
public class HomeController {

    @Autowired
    public WebClient.Builder builder;
    
    @GetMapping("/home")
    public String home(Model model){

        return "/page-home";
    }
    
}
