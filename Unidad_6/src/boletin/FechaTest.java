package boletin;

import java.util.Scanner;

public class FechaTest {

	public static void main(String[] args) {
		
		Fecha f=new Fecha();
		
		System.out.println("La fecha de hoy es: "+f);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("\nDime tu fecha de nacimiento ");
		System.out.print("Dia: ");
		int dia=sc.nextInt();
		System.out.print("Mes: ");
		int mes=sc.nextInt();
		System.out.print("Año: ");
		int anio=sc.nextInt();
		
		Fecha intro=new Fecha(dia,mes,anio);
		
		 System.out.println("\nFecha de nacimiento: "+intro);
		 
		if(intro.isValid())
			
			System.out.println("La fecha introducida no corresponde a una fecha correcta");
		
	
			  int edad = f.getYear() - anio;
          // Si el mes actual es menor que el mes de nacimiento o si es el mismo mes pero el día actual es menor, restar 1
          if (mes > f.getMonth() || (mes == f.getMonth() && dia > f.getDay())) {
              edad--;
          }
		
          
         
          if(!intro.isValid())
          if(edad>=18)
        	  System.out.println("La persona nacida el "+intro.getDay()+" de "+intro.getMonth()+" de "+intro.getYear()+" es MAYOR DE EDAD");
          else
        	  System.out.println("3La persona nacida el "+intro.getDay()+" de "+intro.getMonth()+" de "+intro.getYear()+" es MENOR DE EDAD");
		
		
		
		
		
		}catch (Exception e) {
			System.out.println("ERROR valor no valido");
		}
		
		sc.close();
		
		
	
          
		
		
	}

}
