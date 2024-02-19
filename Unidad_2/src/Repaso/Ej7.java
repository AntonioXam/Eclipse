package Repaso;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int num;
			do {
				System.out.print("Dame un valor entre 1 y 10: ");
				num = sc.nextInt();

			} while (num<=0 || num>10);
			
			System.out.println("El numero "+num+" es un valor en 1 y 10.");
			
		} catch (Exception e) {
			System.out.println("Error!");
		}

		sc.close();

	}

}
