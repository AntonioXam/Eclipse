package ejercicios1;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		int contaC=0, contaI=0; // Contadores de números correctos e incorrectos introducidos
		Scanner sc = new Scanner(System.in);
		try {
			// Pedimos un número entero positivo
			System.out.print("Dime un número: ");
			int num=sc.nextInt();
			while (num!=0) {
				if (num<1 || num>100) {
					System.out.println("Error. No has introducido un no entre 1 y 100");
					contaI++;
				} else {
					System.out.println("El mayor divisor de "+num+" es:"
							+Ejercicio31.mayordivisor(num));

					contaC++;
				}
				System.out.print("\nDime un número: ");
				num=sc.nextInt();
			}
		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
		sc.close();
		System.out.println("Números correctos (dentro de rango): "+contaC);
		System.out.println("Números incorrectos (fuera de rango): "+contaI);
	}
}
