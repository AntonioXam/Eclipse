package Repaso;

import java.util.Scanner;

public class Enterotest2 {

	public static void main(String[] args) {
		
		Entero num= new Entero();
		
		Scanner sc = new Scanner(System.in);
		try {
			 System.out.print("Dime un valor entero: ");
			 num.setNumero(sc.nextInt());
			
			 System.out.println(num.getNumero());
			

			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	     
	

	}

}
