package ejercicios;

import java.util.Scanner;

public class contarhastatunumero2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		try {

			System.out.print("Introduce un número:");
			int num=teclado.nextInt();

			if (num>=1) {
				for (int i=1;i<=num;num--) {
					System.out.print(num+" "); } 
				} else {
					System.out.println("Has introducido un número negativo");
				
			}
		} catch (Exception e) {
			System.out.println("Error. Has introducido valor erroneo");
		}

		teclado.close();
		}

	}
