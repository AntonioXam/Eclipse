package Boletines;

import java.util.Scanner;

public class Cadenatest {

	public static void main(String[] args) {
		
		Cadena C=new Cadena();
		
		Scanner sc = new Scanner(System.in);
		try {
			 
			System.out.print("Dime un cadena de caracteres: ");
			C.setCadena(sc.nextLine());
			
			System.out.println("Nombre: "+C.getCadena());
			System.out.println("Nº Vocales: "+C.contarVocales());
			System.out.println("Nº Consonantes: "+C.contarConsonantes());
			
			System.out.print("Dime una letra: ");
			char letra=sc.next().charAt(0);
			
			if (C.isCaracter(letra)) {
				System.out.println("Contiene la letra");
			} else {
				System.out.println("No contiene la letra");
			}
			
			System.out.print("Sin espacios: ");
			C.deleteBlancos();
			
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();

	}

}
