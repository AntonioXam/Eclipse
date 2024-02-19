package Repaso;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un valor: ");
		int num = sc.nextInt();

		if (num>=1) {

			switch (num) {
			case 1: {
				System.out.println("uno"); } break;
			case 2: {
				System.out.println("dos"); } break;
			case 3: {
				System.out.println("tres"); } break;
			case 4: {
				System.out.println("cuatro"); } break;
			case 5: {
				System.out.println("cinco"); } break;
			case 6: {
				System.out.println("seis"); } break;
			case 7: {
				System.out.println("siete"); } break;
			case 8: {
				System.out.println("ocho"); } break;
			case 9: {
				System.out.println("nueve"); } break;
			default:
				System.out.println("Error: no es un número de un dígito.");
			}
		}else {
			System.out.println("El numero es 0 o menor. No es válido");
		}

		sc.close();
	}

}
