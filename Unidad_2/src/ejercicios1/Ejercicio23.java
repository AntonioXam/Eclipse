package ejercicios1;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		try {
			int conta=0; //Variable que utilizaremos para contar los números que se introducen
			int suma=0; //Variable que utilizaremos para sumar los números que se introducen
			// Leemos números hasta que se teclee un número negativo
			System.out.print("Dime un número: ");
			int num=teclado.nextInt();
			while (num>=0) {
				suma+=num;
				conta++;
				System.out.print("Dime otro número: ");
				num=teclado.nextInt();
			}
			// Mostramos por pantalla la media (evitando una posible división entre cero)
			if (conta!=0)
				System.out.println("Media: "+(float)suma/conta);

		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}

		teclado.close();
	}

}


