package com.clearminds.cca.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.cca.bdd.ConexionBDD;
import com.clearminds.cca.excepciones.BDDException;

public class ServicioBase {

	private Connection conexion;
	
	public void abrirConexion() throws BDDException  {
		
		this.conexion = ConexionBDD.obtenerConexion();
	
	}

	public void cerrarConexion(){
		
		try {
			
			if(this.conexion != null){			
				this.conexion.close();
				System.out.println("Conexion cerrada");
			}	
			
		} catch (SQLException e) {				
				e.printStackTrace();
				System.out.println("Error al cerrar la conexion");
		}		
		
	}
	
	
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	
	
}
