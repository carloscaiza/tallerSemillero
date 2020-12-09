package com.clearminds.cca.bdd.test;

import com.clearminds.cca.dtos.Estudiante;
import com.clearminds.cca.excepciones.BDDException;
import com.clearminds.cca.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {

		
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Pepe", "Perez"));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
