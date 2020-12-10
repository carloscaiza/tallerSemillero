package com.clearminds.cca.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static final String FORMATO_COMPLETO = "yyyy-MM-dd HH:mm:ss";
	
	public static String obtenerFecha(Date date){ // No se necesita instanciar el objeto para usarlo, se invoca a traves de la clase
		
		SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_COMPLETO);
		
		String f = formateador.format(date);
		return f;
	}

}
