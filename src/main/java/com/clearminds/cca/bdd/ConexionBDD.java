package com.clearminds.cca.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.clearminds.cca.excepciones.BDDException;

public class ConexionBDD {
	
	public static String leerPropiedad(String nombreProp){
		
		Properties p = new Properties();
		String propiedad = null;
		
		try {
			
//			p.load(new FileReader("conexion.properties"));
			p.load(new FileReader("D:\\CapacitacionCMC\\Repositorios\\tallerSemillero\\conexion.properties"));
			
			propiedad = p.getProperty(nombreProp);
			
			File f=new File("conexion.properties");
//			System.out.println("ruta:"+f.getAbsoluteFile());

			
//			System.out.println("propiedad="+p.getProperty(nombreProp));
			
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
			return null;
		} catch (IOException e) {			
			e.printStackTrace();
			return null;
		}
		return propiedad;
	}
	
	public static Connection obtenerConexion() throws BDDException{
		
		Connection cn = null;
				
		String user = leerPropiedad("usuario");
		String pass = leerPropiedad("password");
		String url = leerPropiedad("urlConexion");
		
		String connectionUrl = url+"user="+user+";password="+pass;				
				
		try {
		
			cn = DriverManager.getConnection(connectionUrl);
			
			if(cn != null){
				System.out.println("Conectado con éxito");
			}else{
				System.out.println("Error");
				throw new BDDException("No se pudo conectar a la base de datos");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		return cn;
		
	}

}
