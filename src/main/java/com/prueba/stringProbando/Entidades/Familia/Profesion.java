package com.prueba.stringProbando.Entidades.Familia;

import org.springframework.stereotype.Component;

public class Profesion implements DecirProfesion {
	

	@Override
	public String profesion() {
		return "Futuro Messi";
		
	}

}
