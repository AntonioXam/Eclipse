package ejercicios1;

import java.util.Scanner;

public class Ejercicio6 {

	static void cambio_billetes(int N) {

		int n500, n200, n100, n50, n20, n10, n5, resto;
		// Calculamos el número de billetes de 500
		n500=N/500;
		resto=N%500;
		// Calculamos el número de billetes de 200
		n200=resto/200;
		resto%=200;
		// Calculamos el número de billetes de 100
		n100=resto/100;
		resto%=100;
		// Calculamos el número de billetes de 50
		n50=resto/50;
		resto%=50;
		// Calculamos el número de billetes de 20
		n20=resto/20;
		resto%=20;
		// Calculamos el número de billetes de 10
		n10=resto/10;
		resto%=10;
		// Calculamos el número de billetes de 5
		n5=resto/5;
		resto%=5;
		// Visualizamos por pantalla la cuenta de los billetes
		if (n500>0)
			System.out.println("Billetes de 500: " + n500);
		if (n200>0)
			System.out.println("Billetes de 200: " + n200);
		if (n100>0)
			System.out.println("Billetes de 100: " + n100);
		if (n50>0)
			System.out.println("Billetes de 50: " + n50);
		if (n20>0)
			System.out.println("Billetes de 20: " + n20);
		if (n10>0)
			System.out.println("Billetes de 10: " + n10);
		if (n5>0)
			System.out.println("Billetes de 5: " + n5);
		System.out.println("Sobran: "+resto+" €");
	}

	public static void main (String[] argv) {

		try {
			// Leemos por teclado un número

			Scanner entrada = new Scanner(System.in);
			System.out.print("Dime una cantidad (en €): ");
			int cant=entrada.nextInt();
			entrada.close();
			// Llamamos al procedimiento
			cambio_billetes(cant);
		} catch (Exception e) {
			System.out.println("ERROR: El valor introducido no es válido");
		}
	}
}