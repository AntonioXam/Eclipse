package Ejercicios;

import java.util.Scanner;

public class UltimaCifra {

	public static int UltimaCifra(int n) {
		
		String num=String.valueOf(n);
		int ultima=Integer.parseInt(num.substring(num.length()-1, num.length()));
		
		return ultima;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			 
			System.out.print("Introduce un número: ");
			int num=sc.nextInt();
			System.out.println("La ultima cifra del número es: "+UltimaCifra(num));
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	}

	

}
