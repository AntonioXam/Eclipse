package Scanner;

import java.util.Scanner;

public class Scanner2nuevov3 {

	public static void main(String[] args) {
		//Creamos el Lector
		Scanner sc = new Scanner(System.in);

		//Definimos la variable con la que queremos trabajar
		int num;

		// Añadimos "Try" para posibles errores
		try {

			// Pedimos un numero
			System.out.print("Dime un número: ");
			num=sc.nextInt();

			// Cerramos scanner
			sc.close();

			// Añadimos el mensaje del error provocado
		} catch (Exception e) {
			num=0;
		}

		//Mostramos el numero

		System.out.print("El número introducido es: "+num);
		// Cerramos scanner
		sc.close();
	}

}
