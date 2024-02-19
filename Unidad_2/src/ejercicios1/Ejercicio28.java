package ejercicios1;

import java.util.Scanner;

public class Ejercicio28 {

	public static boolean esprimo(int N) {
		// Tomamos el valor absoluto del número (es decir, le quitamos el signo)
		int num=Math.abs(N);
		// Recorremos los posibles divisores del número
		for (int i=2; i<=num/2; i++) {
			if (num%i==0)
				return false;

		}
		// Si no ha encontrado ningún divisor, entonces el número es primo
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int num;
			//Pedimos un numero hasta que sea positivo
			do {
				System.out.print("Introduce un numero : ");
				num=sc.nextInt();

			} while (num<=0);
			if (esprimo(num)) {
				System.out.println("Es primo");

			} else {
				System.out.println("No es primo");
			}
			
		


	} catch (Exception e) {
		System.out.println("ERROR!");
	}
	sc.close();
}

}
