package com.prueba.stringProbando.Entidades.Familia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prueba.stringProbando.Entidades.Familia")
public class FamiliaConfiguracion {
	@Bean
	public Profesion futbol() {
		return new Profesion();
	}
	
	@Bean
	public Familias padre() {
		return new Padre(futbol());
	}
}
