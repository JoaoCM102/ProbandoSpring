package com.prueba.stringProbando.Entidades.Familia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Hijo")
//@Scope("prototype")
public class Hijo implements Familias {
	
	
	
	private DecirProfesion profesion;

	@Autowired //aqui spring busca en el proyecto una clase que implemente la interfaz decir profesion 
	public Hijo(DecirProfesion profesion) {
		this.profesion = profesion;
	}//el autowired tambien se puede usar en un set, metodo cualquiera o campos de clase
	
	@Override
	public void enviar(String mensaje) {
		System.out.println("Hola soy el hijo" + mensaje);
		
	}

	@Override
	public String decirProfesion() {
		return "Soy el hijo y soy " + profesion.profesion();
	}

}
