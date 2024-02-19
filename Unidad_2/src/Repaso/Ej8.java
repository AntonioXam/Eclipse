package Repaso;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
			System.out.print("Introduce un valor: ");
			  num = sc.nextInt();
			  
		if (num>0) {
			for (int pares = 2; pares <=num; pares=pares+2) 
			System.out.print(pares+" ");
			
		
		} else {
			System.out.println("El numero no es positivo.");
		}
		
	     
	     
	     sc.close();
	}

}
