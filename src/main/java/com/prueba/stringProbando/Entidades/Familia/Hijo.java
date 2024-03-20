package com.prueba.stringProbando.Entidades.Familia;

public class Hijo implements Familias {

    private DecirProfesion profesion;
	
	

	public Hijo(DecirProfesion profesion) {
		this.profesion = profesion;
	}
	
	@Override
	public void enviar(String mensaje) {
		System.out.println("Hola soy el hijo" + mensaje);
		
	}

	@Override
	public String decirProfesion() {
		return "Soy el hijo y soy " + profesion;
	}

}
