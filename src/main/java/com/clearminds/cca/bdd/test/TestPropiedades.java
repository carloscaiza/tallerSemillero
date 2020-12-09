package com.clearminds.cca.bdd.test;

import com.clearminds.cca.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor=ConexionBDD.leerPropiedad("usuario");
		System.out.println(valor);
		valor = ConexionBDD.leerPropiedad("password");
		System.out.println(valor);

	}

}
