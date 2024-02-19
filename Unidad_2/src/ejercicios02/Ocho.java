package ejercicios02;

import java.util.Scanner;

public class Ocho {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			int i, edad=0, mayorEdad=0, alumnoAlto=0;
			float altura, alturaMedia=0, edadMedia=0;

			for(i=1; i<=5; i++) {
				System.out.print("Introdce la edad del "+i+"º alumno: ");
				edad=sc.nextInt();
				edadMedia+=edad;
				if(edad>=18)
					mayorEdad++;
				System.out.println("Y ahora su altura: ");
				altura=sc.nextFloat();
				alturaMedia+=altura;
				if(altura>=1.75)
					alumnoAlto++;
			}

			System.out.println("La edad media de lso alumnos es: "+(edadMedia/i));
			System.out.println("La altura media de los alumnos es: "+(alturaMedia/i));
			System.out.println("Hay "+mayorEdad+" alumnos mayores de edad");
			System.out.println("Hay "+alumnoAlto+" alumnos mayores de 1.75m");

			sc.close();
		}catch (Exception e) {
			System.out.println("Error");
		}
	}

}
