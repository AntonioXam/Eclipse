package Repaso;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un valor: ");
		int num1 = sc.nextInt();
		System.out.print("Dame otro valor: ");
		int num2 = sc.nextInt();
		
		if (num1<num2) {
			System.out.println("El menor es : "+num1);
		} else {
			System.out.println("El menor es : "+num2);
		}
		
		 
	     
	     sc.close();

	}

}
