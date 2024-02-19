package Scanner;

import java.util.Scanner;

public class Scanner2nuevov {

	public static void main(String[] args) {
		// Añadimos "Try" para posibles errores
		try {
			//Creamos el Lector
			Scanner sc = new Scanner(System.in);

			// Pedimos un numero
			System.out.print("Dime un número: ");
			int num=sc.nextInt();

			//Mostramos el numero
			System.out.print("El número introducido es: "+num);


			// Cerramos scanner
			sc.close();
			
			// Añadimos el mensaje del error provocado
		} catch (Exception e) {
			System.err.println("ERROR DE SISTEMA: No has introducido un número entero.");
		}
	}

}
