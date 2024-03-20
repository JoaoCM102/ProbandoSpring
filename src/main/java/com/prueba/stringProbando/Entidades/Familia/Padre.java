package com.prueba.stringProbando.Entidades.Familia;

public class Padre implements Familias {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Hola soy el padre" + mensaje);
	}

}