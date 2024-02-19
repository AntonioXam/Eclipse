package Repaso;

import java.util.Scanner;

public class Ej13 {
	
	public static void tabla(int N) {
		for (int i = 1; i <=10; i++) {
			System.out.println(N+"x"+i+"="+(N*i));
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Introduce un numero del 1 al 10: ");
			int num = sc.nextInt();
			if (num>0 && num<=10) {
				tabla(num);

			} else {
				System.out.println("No es un numero valido.");
			}
		} catch (Exception e) {
			System.out.println("Error. caracter no valido.");
		}

		sc.close();

	}

}
