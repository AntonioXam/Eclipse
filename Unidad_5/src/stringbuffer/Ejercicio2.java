package stringbuffer;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		
		
		Scanner sc = new Scanner(System.in);
	     try {

	    
		System.out.print("Introduce una cadena de caracteres: ");
		String nombre=sc.nextLine().trim();
		
		
		StringBuffer reves=new StringBuffer(nombre);
		
		reves.reverse();
		
		System.out.println(nombre+reves.substring(1));
	
		
	     }catch (Exception e) {
			System.out.println("Error");
		}
		
		sc.close();
		

	}

}
