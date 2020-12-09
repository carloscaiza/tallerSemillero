package com.clearminds.cca.bdd.test;

import com.clearminds.cca.dtos.Estudiante;
import com.clearminds.cca.excepciones.BDDException;
import com.clearminds.cca.servicios.ServicioEstudiante;

public abstract class TestActualizar {

	public static void main(String[] args) {

		ServicioEstudiante srvEstudiante = new ServicioEstudiante();

		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("Clear", "Minds",3));	
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
