package Ejercicios2;

import java.util.Scanner;




public class Ejercicio10 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mayor=100,menor=1;
		
		int media = (mayor+menor)/2;
		int intentos = 0;
		
		String palabra;
		
		
		try {
			System.out.println("Piensa un número del 1 al 100");
			System.out.println("Te muestro un número: "+media);
			palabra= sc.nextLine();
			intentos++;
			
			
			while (palabra!="igual") {
			
			switch (palabra) {
			case "mayor":
				menor=media;
				System.out.println("Tu número es: "+(media=(menor+mayor)/2)+"?");
				System.out.print("mayor, menor o igual?: ");
				break;
			case "menor":
				mayor=media;
				System.out.println("Tu número es: "+(media=(menor+mayor)/2)+"?");
				System.out.print("mayor, menor o igual?: ");
				break;
			case "igual":
				System.out.println("Lo he acertado!!!");
				System.out.println("Intentos "+intentos);
				break;
			 }
			
			palabra= sc.nextLine();
			intentos++;
			}
			
			
		} catch (Exception e) {
			
			System.out.println("Error. Caracter no válido.");
		}
		sc.close();
	}

}
