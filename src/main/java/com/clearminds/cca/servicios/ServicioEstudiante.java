package com.clearminds.cca.servicios;

//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;

import com.clearminds.cca.dtos.Estudiante;
import com.clearminds.cca.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		
		abrirConexion();
		System.out.println("insertando estudiante: " + estudiante);
		Statement stmt = null;
		
		try {
			stmt = getConexion().createStatement();
			String sql = "insert into estudiantes(nombre, apellido, edad) values ('"+ estudiante.getNombre()+"', '"+estudiante.getApellido()+"',"+estudiante.getEdad()+")";
			System.out.println("Script: " +sql);
			
			stmt.executeUpdate(sql);
			cerrarConexion();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");

		}
	}
	
	public void actualizarEstudiante(Estudiante estudiante) throws BDDException{
		
		abrirConexion();
		System.out.println("Editando estudiante: " + estudiante);
		Statement stmt = null;
		
		try {
			stmt = getConexion().createStatement();
			String sql = "update estudiantes set nombre='"+estudiante.getNombre()+"' , apellido='"+ estudiante.getApellido() +"', edad="+estudiante.getEdad()+" where id="+estudiante.getNumero(); 
			System.out.println("Script: " +sql);
			
			stmt.executeUpdate(sql);
			cerrarConexion();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}
		
	}
	
//	public void eliminarEstudiante(Estudiante estudiante) throws BDDException{
//		
//		abrirConexion();
//		System.out.println("Eliminando estudiante: " + estudiante);
//		Statement stmt = null;
//		
//		try {
//			stmt = getConexion().createStatement();
//			String sql = "delete from estudiantes where id="+estudiante.getNumero(); 
//			System.out.println("Script: " +sql);
//			
//			stmt.executeUpdate(sql);
//			cerrarConexion();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new BDDException("Error al eliminar estudiante");
//		}
//		
//	}
//	
//	public ArrayList<Estudiante> listarEstudiantes()throws BDDException{
//		abrirConexion();
//		System.out.println("Listando estudiantes...");
//		ArrayList<Estudiante> resultado = null;
//		Estudiante est = null; 
//		Statement stmt = null;
//		ResultSet rs;
//		
//		try {
//			resultado = new ArrayList<Estudiante>();
//			stmt = getConexion().createStatement();
//			String sql = "SELECT * FROM estudiantes"; 
//			System.out.println("Script: " +sql);
//			
//			rs = stmt.executeQuery(sql);
//			
////			stmt.executeUpdate(sql);			
////			rs = cs.executeQuery();	
//			
//			while( rs.next() ){
//				est = new Estudiante();
//				est.setNumero(rs.getInt(1));
//				est.setNombre(rs.getString(2));
//				est.setApellido(rs.getString(3));				
//				
//				resultado.add(est);
//			}	
//			cerrarConexion();																		
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new BDDException("Error al eliminar estudiante");
//		}
//		return resultado;		
//	}
//	
//	public Estudiante buscarEstudiante(int num) throws BDDException{
//		
//		abrirConexion();
//		System.out.println("Buscando estudiante...");		
//		Estudiante est = null; 
//		Statement stmt = null;
//		ResultSet rs;
//		
//		try {
//			stmt = getConexion().createStatement();
//			String sql = "select  * from estudiantes where id="+num; 
//			System.out.println("Script: " +sql);
//			
//			rs = stmt.executeQuery(sql);
//			
//			if(rs.next()){
//				est = new Estudiante();
//				est.setNumero(rs.getInt(1));
//				est.setNombre(rs.getString(2));
//				est.setApellido(rs.getString(3));
//			}
//			cerrarConexion();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new BDDException("Error al buscar estudiante");
//		}
//		return est;
//	}
//	

}
