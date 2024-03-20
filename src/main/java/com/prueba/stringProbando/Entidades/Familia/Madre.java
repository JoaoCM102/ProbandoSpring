package com.prueba.stringProbando.Entidades.Familia;

public class Madre implements Familias {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Hola soy la madre" + mensaje);
		
	}

}
