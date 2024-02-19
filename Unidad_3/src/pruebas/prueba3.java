package pruebas;

import java.util.Scanner;

public class prueba3 {

	public static boolean Primo(int n) {
		for (int i = 2; i<=n/2; i++) {
			if (n%i==0) 
				return false;
				
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num;
		int conta=0;
		try {
			do {
				System.out.print("Introduce un número entre 1 y 100: ");
		    	num=sc.nextInt();
		    	if (num<1 || num>100) {
					System.out.println("El número introducido no se encuentra entre 1 y 100.");
				}
			} while (num<1 || num>100);
			
			for (int i = 2; i <=num; i++) {
				if (Primo(i)) {
					conta++;	
				}	
			}
			System.out.println("Entre 1 y "+num+" hay "+conta+" números primos.");
		} catch (Exception e) {
			System.out.println("ERROR!");
		}
	     
	     
	     
	     sc.close();
	}

}
