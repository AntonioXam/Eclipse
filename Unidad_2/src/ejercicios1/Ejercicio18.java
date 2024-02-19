package ejercicios1;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de filas del triangulo: ");
		int filas = sc.nextInt();
		

		for(int i=1;i<=filas;i++) {
		
			for(int j=1;j<=filas-i;j++) {
				System.out.print(" ");
			}	

			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*"); 	
			}

			System.out.println(); }

		for(int i=filas-1;filas<=i;i++) {
			
			for(int j=1;j<=filas-i;j++) {
				System.out.print(" ");
			}	

			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*"); 	
			}

			System.out.println(); }

		sc.close();
	}

}
