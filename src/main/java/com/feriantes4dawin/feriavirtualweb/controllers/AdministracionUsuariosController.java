package com.feriantes4dawin.feriavirtualweb.controllers;

import java.sql.SQLException;
import java.util.List;

import com.feriantes4dawin.feriavirtualweb.to.UsuarioTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/administracionUsuarios")
public class AdministracionUsuariosController {
	
	/*
	@Autowired
	private UsuarioDao usuarioDao;
	*/
	
    @GetMapping()
    public String administracionUsuarios(Model model){
    	//TODO:Ofrecer datos y crear modelos para API
        return "/administracionUsuarios";
    }
    
    @GetMapping("/{idUsuario}")
    public String buscarUsuarioIdUsuarios(Model model, @PathVariable int idUsuario){
    	//TODO: Recuperar un usuario por API
    	return "/administracionUsuarios";
    }
    
    @PostMapping()
    public String crearUsuario(Model model ,
    		@ModelAttribute(value = "usuarioCrear") UsuarioTO usuarioCrear){
		
		//TODO: Crear usuarios por API
    	return "/administracionUsuarios";
    }
    
    private void cargaUsuarios(Model model ) {
    	
		//TODO: Listar usuarios por API
        
    }

}
