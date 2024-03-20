package com.prueba.stringProbando.Entidades.Familia;

public class Hijo implements Familias {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Hola soy el hijo" + mensaje);
		
	}

}
