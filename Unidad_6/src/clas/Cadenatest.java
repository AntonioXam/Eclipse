package clas;

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
			System.out.println("Vocales: "+C.lasVocales());
			System.out.println("Nº Consonantes: "+C.contarConsonantes());
			System.out.println("Consonantes: "+C.lasConsonantes());
			System.out.println("Todo en mayúsculas: "+C.mayusculas());
			System.out.println("Todo en minúsculas: "+C.minusculas());
			System.out.println("Sin espacios: "+C.deleteBlancos());
			System.out.println("Al reves: "+C.alReves());
			
			System.out.print("Dime una letra para encontrar: ");
			char letra=sc.next().charAt(0);
			
			if (C.isCaracter(letra)) {
				System.out.println("Contiene la letra");
			} else {
				System.out.println("No contiene la letra");
			}
			
			
			if(C.esPalindromo())
				System.out.println("Es un palindromo");
			
			System.out.print("Dime una letra para eliminar");
			char letra2=sc.next().charAt(0);
			System.out.println("Sin la letra: "+C.eliminar(letra2));
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();

	}

}
