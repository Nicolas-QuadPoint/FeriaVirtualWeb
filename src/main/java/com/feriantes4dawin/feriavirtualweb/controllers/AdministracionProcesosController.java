package com.feriantes4dawin.feriavirtualweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministracionProcesosController {


  
    @GetMapping("/administracionProcesos")
    public String administracionProcesos(Model model){
        
        return "/administracionProcesos";
    }

}
