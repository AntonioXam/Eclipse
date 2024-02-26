package Wrappers;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Edad {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Date d=new Date();
			GregorianCalendar c=new GregorianCalendar();
			c.setTime(d);
			
			
			int dhoy=c.get(Calendar.DAY_OF_MONTH);
			int mhoy=c.get(Calendar.MONTH+1);
			int ahoy=c.get(Calendar.YEAR);
			
			System.out.println(d);
			System.out.println("Fecha de hoy: "+dhoy+"/"+mhoy+"/"+ahoy);
			try {
				 
				System.out.println("Dime tu fecha de nacimiento:");
				System.out.print("Dia: ");
				int dia=sc.nextInt();
				System.out.print("Mes: ");
				int mes=sc.nextInt();
				System.out.print("Año: ");
				int año=sc.nextInt();
				
				
				int edad=ahoy-año;
				if(dia<=dhoy && mes<=mhoy)
					edad-=1;
				
				System.out.println("Tienes "+edad+" años");
				
				
				
			} catch (Exception e) {
				System.out.println("ERROR!. Has introducido un valor no válido.");
			}
		   
		     sc.close();
		}

	}
