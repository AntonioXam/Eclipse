package PruebasCasa;

import java.util.Scanner;

public class Ttest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una hora ");
		System.out.print("Hora: ");
		int h=sc.nextInt();
		System.out.print("Minutos: ");
		int m=sc.nextInt();
		System.out.print("Segundos: ");
		int s=sc.nextInt();
		sc.close();
		
		Tiempo time=new Tiempo(h,m,s);
		
		if (time.horaOK()) { 
			System.out.println("\nHora introducida: "+time.toString());
		}else { 
			System.out.println("\nHora incorrecta.");
	}
		
		Tiempo actual=new Tiempo();
		actual.horaActual();
		System.out.println("\nHora en este momento "+actual);
		
		 if(time.getHora()<actual.getHora())
			 System.out.println("La hora es antes que la actual");
		 else if(time.getHora()>actual.getHora())
			 System.out.println("La hora es despues de la actual");
		 else if(time.getMinutos()<actual.getMinutos())
			 System.out.println("La hora es antes que la actual");
		 else if(time.getMinutos()>actual.getMinutos())
			 System.out.println("La hora es despues de la actual");
		 else
			 System.out.println("Las horas son iguales");
	}

}
