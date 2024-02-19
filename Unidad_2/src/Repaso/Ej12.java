package Repaso;

import java.util.Scanner;

public class Ej12 {

	public static long factorial(int N) {
		long fact=1;
		for (int i = N; i>0; i--) {
			fact=fact*i;	
		}
		return fact;
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero para hallar su factorial: ");
	     int num = sc.nextInt();
	    System.out.print("El factorial de "+num+" es : "+factorial(num));
	    
	     sc.close();
		

	}

}
