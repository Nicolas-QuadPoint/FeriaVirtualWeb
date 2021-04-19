package com.feriantes4dawin.feriavirtualweb;

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
	 * @return
	 */
	@Bean
	public WebClient.Builder webClientBuilder() {
		return WebClient.builder();
	}

}
	