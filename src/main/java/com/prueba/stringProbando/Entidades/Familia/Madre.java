package com.prueba.stringProbando.Entidades.Familia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Madre")
public class Madre implements Familias {
	
	
	/*@PostConstructor va aqui pero me da un error imagino que tengo 
	que descargar la anotacion destroy igual */
	
    private DecirProfesion profesion;
	
	

	@Override
	public void enviar(String mensaje) {
		System.out.println("Hola soy la madre" + mensaje);
		
	}

	@Override
	public String decirProfesion() {
		return "Soy la madre y soy " + profesion.profesion();
		
	}
	
	@Autowired
	public void setProfesion(DecirProfesion profesion) {
		this.profesion = profesion;
	}

	
}
