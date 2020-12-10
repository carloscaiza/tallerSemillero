package com.clearminds.cca.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.clearminds.cca.dtos.Estudiante;

public class EstudianteImpl implements IEstudiante {		

	public void insertarEstudiante(Estudiante estudiante) {
		
		FileWriter flwriter = null;
		
		ArrayList<Estudiante> estudents = null;
				
		try {
			estudents = new ArrayList<Estudiante>();
			estudents.add(estudiante);
						
			flwriter = new FileWriter("D:\\CapacitacionCMC\\Repositorios\\tallerSemillero\\estudiantes.txt", true);
			
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			
			for (Estudiante estudent : estudents) {				
				bfwriter.write(estudiante.getNumero() + "," + estudiante.getNombre() + "," + estudiante.getApellido()+ "\r\n");
			}
			
			bfwriter.close();
			System.out.println("Estudiante ingresado satisfactoriamente..");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	public void actualizarEstudiante(Estudiante estudiante) {
		
		String tempFile = "D:\\CapacitacionCMC\\Repositorios\\tallerSemillero\\estudiantesTemp.txt";
		File oldFile = new File("D:\\CapacitacionCMC\\Repositorios\\tallerSemillero\\estudiantes.txt");
		File newFile = new File(tempFile);
		
		int id = 0; String nombre = ""; String apellido = "";
		
		Scanner x;		
		
		try {
			FileWriter fw = new FileWriter(tempFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			x = new Scanner(new File("D:\\CapacitacionCMC\\Repositorios\\tallerSemillero\\estudiantes.txt"));
			x.useDelimiter("[,\n]");
//			x.useDelimiter("\\s*,\\s*");
			
			while (x.hasNext()) {
				id = x.nextInt();
				nombre = x.next();
				apellido = x.next();
				if(id == estudiante.getNumero()){
//					pw.print(estudiante.getNumero()+","+estudiante.getNombre()+","+estudiante.getApellido()+"\n"); SI FUNCIONA
					pw.println(estudiante.getNumero()+","+estudiante.getNombre()+","+estudiante.getApellido());
				}else{
					pw.print(id+","+nombre+","+apellido+"\n");
//					bw.write(id+","+nombre+","+apellido+ "\r\n");
				}			
			}
			x.close();
			pw.flush();
			pw.close();
			oldFile.delete();
			File dump = new File("D:\\CapacitacionCMC\\Repositorios\\tallerSemillero\\estudiantes.txt");
			newFile.renameTo(dump);
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			System.out.println("Error");
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

	public void eliminarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Estudiante> listarEstudiantes() {
		
		File file = new File("D:\\CapacitacionCMC\\Repositorios\\tallerSemillero\\estudiantes.txt");
		ArrayList<Estudiante> listaEstudiantes = null; 
		Estudiante e = null;
		Scanner scanner;
		
		try {
			
			listaEstudiantes = new ArrayList<Estudiante>();
			scanner = new Scanner(file);
			
			while (scanner.hasNextLine()) {
				
				String linea = scanner.nextLine();
				Scanner delimitar = new Scanner(linea);
					
				delimitar.useDelimiter("\\s*,\\s*");
				e= new Estudiante();
				
				e.setNumero(delimitar.nextInt());
				e.setNombre(delimitar.next());
				e.setApellido(delimitar.next());
				
				listaEstudiantes.add(e);
			}
			
			scanner.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		return listaEstudiantes;
	}

	public Estudiante buscarEstudiante(int num) {
		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes = listarEstudiantes();
		
		Estudiante estEncontrado = null;
		
		for (Estudiante estudiante : estudiantes) {
			if(estudiante.getNumero() == num ){
				estEncontrado = estudiante;
				break;
			}
		}
				
		return estEncontrado;
	}
	

}
