package com.clearminds.cca.dao;

import java.util.ArrayList;

import com.clearminds.cca.dtos.Estudiante;

public interface IEstudiante {
	
	public void insertarEstudiante(Estudiante estudiante);
	
	public void actualizarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante(Estudiante estudiante);
	
	public ArrayList<Estudiante> listarEstudiantes();
	
	public Estudiante buscarEstudiante(int num);

}
