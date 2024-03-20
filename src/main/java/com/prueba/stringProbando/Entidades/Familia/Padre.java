package com.prueba.stringProbando.Entidades.Familia;

public class Padre implements Familias {
	
	private DecirProfesion profesion;
	
	

	public Padre(DecirProfesion profesion) {
		this.profesion = profesion;
	}

	@Override
	public void enviar(String mensaje) {
		System.out.println("Hola soy el padre" + mensaje);
	}

	@Override
	public String decirProfesion() {
		return "Soy el padre y soy " + profesion.profesion();
		
	}

}