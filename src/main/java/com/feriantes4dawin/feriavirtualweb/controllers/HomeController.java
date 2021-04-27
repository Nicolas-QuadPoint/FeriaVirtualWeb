package com.feriantes4dawin.feriavirtualweb.controllers;

import com.feriantes4dawin.feriavirtualweb.models.Usuarios;
import com.feriantes4dawin.feriavirtualweb.network.FeriaVirtualWebAPIProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
public class HomeController {

    @Autowired
    public WebClient.Builder builder;

    @Autowired
    public FeriaVirtualWebAPIProvider api;
    
    @GetMapping("/home")
    public String home(Model model){
        
        Usuarios u = api.getSimpleObject(builder,Usuarios.class);
        System.out.println(u);

        return "/page-home";
    }
    
}
