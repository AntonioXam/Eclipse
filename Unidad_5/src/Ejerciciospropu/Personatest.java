package Ejerciciospropu;

import java.util.Scanner;

public class Personatest {

	public static void muestraPeso(Persona p) {
		switch (p.calcularIMC()) {
		case -1: System.out.println("La persona está por debajo de su peso ideal");

		break;

		case 0: System.out.println("La persona está en su peso ideal");

		break;

		case 1: System.out.println("La persona está por encima de su peso ideal");

		break;
		}
	}

	public static void muestraEdad(Persona p) {
		if (p.esMayordeEdad()) {
			System.out.println("La persona es mayor de edad");
			
		} else {
			System.out.println("La persona es menor de edad");
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Introduce los datos: ");
			System.out.print("Nombre: ");
			String nombre=sc.nextLine();
			System.out.print("Edad: ");
			int edad=sc.nextInt();
			char sexo;
			do {
			System.out.print("Sexo (H|M): ");
			sexo = sc.next().charAt(0);
			} while (sexo!='H' && sexo!='h' && sexo!='M' && sexo!='m');
			System.out.print("Peso: ");
			double peso=sc.nextDouble();
			System.out.print("Altura: ");
			double altura=sc.nextDouble();
			
			Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
			System.out.println(p1);
			muestraEdad(p1);
			muestraPeso(p1);
			
			
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		
		
		
		
		
		sc.close();


	}

}
