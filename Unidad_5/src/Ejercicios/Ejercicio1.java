package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     try {

	    
		System.out.print("Introduce una cadena de caracteres: ");
		String nombre=sc.nextLine().trim();
		
		
		System.out.print("Al reves: ");
		for(int i=nombre.length()-1; i>=0; i--)
			System.out.print(nombre.charAt(i));
		System.out.println();
		
	
		
	     }catch (Exception e) {
			System.out.println("Error");
		}
		
		sc.close();
		
}
}