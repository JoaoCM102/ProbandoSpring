package com.prueba.stringProbando.Entidades.Familia;

public class Madre implements Familias {

    private DecirProfesion profesion;
	
	

	public Madre(DecirProfesion profesion) {
		this.profesion = profesion;
	}
	@Override
	public void enviar(String mensaje) {
		System.out.println("Hola soy la madre" + mensaje);
		
	}

	@Override
	public String decirProfesion() {
		return "Soy la madre y soy " + profesion;
		
	}

}
