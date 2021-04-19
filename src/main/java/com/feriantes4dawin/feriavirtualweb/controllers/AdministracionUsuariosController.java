package com.feriantes4dawin.feriavirtualweb.controllers;

import com.feriantes4dawin.feriavirtualweb.conf.FeriaVirtualWebConfig;
import com.feriantes4dawin.feriavirtualweb.models.Usuario;
import com.feriantes4dawin.feriavirtualweb.models.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/administracionUsuarios")
public class AdministracionUsuariosController {
	
	@Autowired
	private WebClient.Builder clienteWeb;
	
	
    @GetMapping()
    public String administracionUsuarios(ModelAndView view){
    			
		Usuarios u = clienteWeb.build().
			get().
			uri(FeriaVirtualWebConfig.URL_BASE_API+"/usuarios").
			accept(MediaType.APPLICATION_JSON).
			retrieve().bodyToMono(Usuarios.class).
			block();

		view.addObject("listaUsuarios", u);

        return "/index";
    }
    
    @GetMapping("/{idUsuario}")
    public String buscarUsuarioIdUsuarios(Model model, @PathVariable int idUsuario){
    	//TODO: Recuperar un usuario por API
    	return "/index";
    }
    
    @PostMapping()
    public String crearUsuario(ModelAndView view){
		
		//TODO: Crear usuarios por API
    	return "/index";
    }
    
    private void cargaUsuarios(ModelAndView view) {
    	
		//TODO: Listar usuarios por API
        
    }

}
