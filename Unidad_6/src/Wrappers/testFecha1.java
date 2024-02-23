package Wrappers;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class testFecha1 {

	public static void main(String[] args) {
		
		GregorianCalendar f= new GregorianCalendar(2024,1,23,10,10,34);
		
		System.out.println("Año: "+f.get(Calendar.YEAR));
		System.out.println("Mes: "+f.get(Calendar.MONTH));
		System.out.println("Dia: "+f.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia del año: "+f.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("Hora: "+f.get(Calendar.HOUR));
		System.out.println("Minutos: "+f.get(Calendar.MINUTE));
		System.out.println("Segundos: "+f.get(Calendar.SECOND));
		
	}

}
