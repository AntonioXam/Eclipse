package ejercicios1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Introduzca un número: ");
			int i=sc.nextInt();
			if (i>=1) {
				switch (i) {
				case 1:System.out.println("UNO");break;
				case 2:System.out.println("DOS");break;
				case 3:System.out.println("TRES");break;
				case 4:System.out.println("CUATRO");break;
				case 5:System.out.println("CINCO");break;
				case 6:System.out.println("SEIS");break;
				case 7:System.out.println("SIETE");break;
				case 8:System.out.println("OCHO");break;
				case 9:System.out.println("NUEVE");break;
				default:System.out.println("No es un número de un solo digito");
				}

			} else {
				System.out.println("No es un número positivo o es 0");

			}

		} catch (Exception e) {
			System.out.println("Error!!");
		}
		sc.close();


	}

}
