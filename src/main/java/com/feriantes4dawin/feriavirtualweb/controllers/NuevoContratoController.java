package com.feriantes4dawin.feriavirtualweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NuevoContratoController {

    @GetMapping("/nuevoContrato")
    public String nuevoContrato(Model model){
        
        return "/nuevoContrato";

}
}
