package Boletines;

import java.util.Scanner;



public class CadenaTest1 {

	public static void main(String[] args) {
		Cadena C=new Cadena();


		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Introduce un nombre: ");
			C.setCadena(sc.nextLine());

			System.out.println("\nNombre: "+C.getCadena());
			System.out.println("Nº Vocales: "+C.contarVocales());
			System.out.println("Nº Consonantes: "+C.contarConsonantes());

			
			System.out.print("\nEscribe un Caràcter (a-z|A-Z): ");
			

		
	


		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}

		sc.close();

	}

}
