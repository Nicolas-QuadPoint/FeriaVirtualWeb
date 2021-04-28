package com.feriantes4dawin.feriavirtualweb;

import com.feriantes4dawin.feriavirtualweb.repositories.NacionalidadRepository;
import com.feriantes4dawin.feriavirtualweb.repositories.ParClaveValorRepository;
import com.feriantes4dawin.feriavirtualweb.repositories.UsuarioRepository;
import com.feriantes4dawin.feriavirtualweb.repositories.impl.NacionalidadRepositoryImpl;
import com.feriantes4dawin.feriavirtualweb.repositories.impl.ParClaveValorRepositoryImpl;
import com.feriantes4dawin.feriavirtualweb.repositories.impl.UsuarioRepositoryImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class FeriaVirtualWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeriaVirtualWebApplication.class, args);
	}

	/**
	 * NOTES: Arranca la app con .\mvnw spring-boot:run
	 */

	/**
	 * Esta cosa lo que hace es crear un objeto WebClient para
	 * poder realizar peticiones http a traves de los controllers.
	 * Los controllers deben crear una variable autowired de tipo
	 * WebClient para poder consumir la API
	 * @return Un objeto WebClient.Builder para realizar la petición.
	 */
	@Bean
	public WebClient.Builder webClientBuilder() {
		return WebClient.builder();
	}


	/**
	 * Genera una interfaz para comunicarse de forma ordenada
	 * con la WebAPI, solo para usuarios.
	 * @return Un objeto UsuarioRepository que permite operaciones
	 * CRUD
	 */
	@Bean
	public UsuarioRepository createUsuarioRepository(){
		return new UsuarioRepositoryImpl();
	}

	@Bean
	public ParClaveValorRepository createParValorRepository(){
		return new ParClaveValorRepositoryImpl();
	}

	@Bean
	public NacionalidadRepository createNacionalidadRepository(){
		return new NacionalidadRepositoryImpl();
	}

}
	