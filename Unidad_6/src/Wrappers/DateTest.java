package Wrappers;


import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		
		Date fecha1=new Date();   //fecha actual
		Date fecha2=new Date(0);	//milisegundo 0
		Date fecha3=new Date(1000);	//milisegundos desde el inicio
		
		System.out.println(fecha1.toString());
		System.out.println(fecha2.toString());
		System.out.println(fecha3.toString());
		System.out.println(fecha2.after(fecha3));
		System.out.println(fecha3.before(fecha1));
		
	}

}
