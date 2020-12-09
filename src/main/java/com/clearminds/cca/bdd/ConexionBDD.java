package com.clearminds.cca.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {
	
	public static String leerPropiedad(String nombreProp){
		
		Properties p = new Properties();
		String propiedad = null;
		
		try {
			
			p.load(new FileReader("conexion.properties"));
			
			propiedad = p.getProperty(nombreProp);
			
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

}
