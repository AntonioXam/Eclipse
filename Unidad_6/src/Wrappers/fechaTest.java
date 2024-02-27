package Wrappers;

import java.util.Scanner;

public class fechaTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		fecha fintro;

		;
		try {
			System.out.println("Introduce una fecha ");
			System.out.print("Dia: ");
			int dia=sc.nextInt();
			System.out.print("Mes: ");
			int mes=sc.nextInt();
			System.out.print("Año: ");
			int anio=sc.nextInt();

			fintro=new fecha(dia,mes,anio);

		}catch (Exception e) {
			System.err.println(" ERROR no has introducido un valor correcto");
			fintro=new fecha();
			System.out.println("Tomaremos la fecha: "+fintro.toString());
		}	

		sc.close();

		fecha actual=new fecha();

		actual.setFechaActual();

		System.out.println("Fecha actual: "+actual);


		if(!fintro.fechaOK())
			System.out.println("La fecha es incorreta");
		else
			System.out.println("Fecha introducida: "+fintro);

		if(fintro.fechaOK())
			if(fintro.getAnio()<actual.getAnio())
				System.out.println("La fecha introducida pertenece al pasado");
			else if(fintro.getAnio()==actual.getAnio()) {
				if(fintro.getMes()<actual.getMes())
					System.out.println("La fecha introducida pertenece al pasado");
				else if(fintro.getMes()==actual.getMes()) {
					if(fintro.getDia()<actual.getDia())
						System.out.println("La fecha introducida pertenece al pasado");
					else if(fintro.getDia()==actual.getDia()) 
						System.out.println("La fecha es misma");
					else 
						System.out.println("Fecha es posterior");
					
				} else
					System.out.println("Fecha es posterior");
			} else
				System.out.println("Fecha es posterior");


	}

}
