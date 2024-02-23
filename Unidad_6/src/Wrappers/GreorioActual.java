package Wrappers;

import java.util.*;

public class GreorioActual {

	public static void main(String[] args) {
		
		Date d=new Date();
		GregorianCalendar c=new GregorianCalendar();
		
		c.setTime(d);  //añadimos date a calendar
		
		int dia=c.get(Calendar.DAY_OF_MONTH);
		int mes=c.get(Calendar.MONTH);
		int ano=c.get(Calendar.YEAR);
		System.out.println("Fecha: "+dia+"-"+mes+"-"+ano);
		//Mostramos la hora actual
		
		int hora=c.get(Calendar.HOUR);
		int minutos=c.get(Calendar.MINUTE);
		int segundos=c.get(Calendar.SECOND);
		System.out.println("Hora: "+hora+":"+minutos+":"+segundos);
		

	}

}
