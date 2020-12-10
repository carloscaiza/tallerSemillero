package com.clearminds.cca.bdd.test;

import java.util.ArrayList;

import com.clearminds.cca.dtos.Estudiante;
import com.clearminds.cca.excepciones.BDDException;
import com.clearminds.cca.servicios.ServicioEstudiante;


public abstract class TestActualizar {

	public static void main(String[] args) {

		ServicioEstudiante srvEstudiante = new ServicioEstudiante();

		try {
//			srvEstudiante.insertarEstudiante(new Estudiante("CARLOS", "CAIZA", 25));
			srvEstudiante.actualizarEstudiante(new Estudiante("Clear", "Minds",1, 20));	
//			srvEstudiante.eliminarEstudiante(new Estudiante("Clear", "Minds",3));	
			
//			ArrayList<Estudiante> estudiantes = null;
//			estudiantes = srvEstudiante.listarEstudiantes();
//			
//			for (Estudiante estudiante : estudiantes) {
//				System.out.println(estudiante);
//			}
//			Estudiante estudianteEnc = null;
//			estudianteEnc = srvEstudiante.buscarEstudiante(4);
//			System.out.println(estudianteEnc);
			
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}					

	}
}
