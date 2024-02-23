package Wrappers;

import java.util.Scanner;

public class Datos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad=Integer.parseInt(sc.nextLine());
		
		System.out.print("Introduce tu nombre: ");
		String nombre=sc.nextLine().trim();
		
		System.out.println(nombre+", "+edad+" años.");
		
		
		sc.close();
	}

}
