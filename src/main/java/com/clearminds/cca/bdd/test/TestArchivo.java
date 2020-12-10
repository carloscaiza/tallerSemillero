package com.clearminds.cca.bdd.test;

import java.util.ArrayList;

import com.clearminds.cca.dao.EstudianteImpl;
import com.clearminds.cca.dtos.Estudiante;

public class TestArchivo {
	
	public static void main(String[] args) {
		
		EstudianteImpl estImp = new EstudianteImpl();
		
//		INSERTAR ESTUDIANTE
//		Estudiante est = new Estudiante("Carlos", "Caiza", 1);		
//		Estudiante est2 = new Estudiante("Juan", "Pedraza", 2);		
//		Estudiante est3 = new Estudiante("Carlitos", "Caiza Aguilar", 3);		
		Estudiante est4 = new Estudiante("Santiago", "Morales", 4);		
//		estImp.insertarEstudiante(est);
//		estImp.insertarEstudiante(est2);
//		estImp.insertarEstudiante(est3);
		estImp.insertarEstudiante(est4);
		
//		LISTAR ESTUDIANTES
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes = estImp.listarEstudiantes();
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println(estudiantes.get(i));
		}
//		
//		BUSCAR ESTUDIANTE
//		Estudiante estEnc = null;
//		estEnc = estImp.buscarEstudiante(3);
//		
//		if(estEnc != null){
//			System.out.println(estEnc);
//		}else{
//			System.out.println("Estudiante null");
//		}
			
		
//		MODIFICAR ESTUDIANTE
//		Estudiante estModificar = new Estudiante("Cesar", "Carua", 2);		
//		estImp.actualizarEstudiante(estModificar);
//		
//		System.out.println("---------------------------");
//		
//		ArrayList<Estudiante> estudiantes1 = new ArrayList<Estudiante>();
//		estudiantes1 = estImp.listarEstudiantes();
//		for (int i = 0; i < estudiantes1.size(); i++) {
//			System.out.println(estudiantes1.get(i));
//		}
		
	}

}
