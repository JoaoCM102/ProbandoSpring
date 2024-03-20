package com.prueba.stringProbando.Entidades.Familia;

public class Madre implements Familias {

    private DecirProfesion profesion;
	
	

	@Override
	public void enviar(String mensaje) {
		System.out.println("Hola soy la madre" + mensaje);
		
	}

	@Override
	public String decirProfesion() {
		return "Soy la madre y soy " + profesion.profesion();
		
	}

	public void setProfesion(DecirProfesion profesion) {
		this.profesion = profesion;
	}

	
}
