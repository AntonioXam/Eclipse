package Repaso;

import java.util.Scanner;

public class Ej2 {

	
	public static int menor(int a, int b, int c) {
		if (a<b && a<c) {
			return a; }
		else if (b<a && b<c) {
			return b; }
		else {
			return c;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un valor: ");
	     int num1 = sc.nextInt();
	     System.out.print("Introduce otro valor: ");
	     int num2 = sc.nextInt();
	     System.out.print("Introduce otro valor: ");
	     int num3 = sc.nextInt();
	     
	     System.out.println("El menor de los 3 numeros es: "+menor(num1, num2, num3));
	      
	      
	     
	     
	     sc.close();
		
	}

}
