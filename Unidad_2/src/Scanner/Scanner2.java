package Scanner;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		//Creamos el Lector
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un numero
		System.out.print("Dime un número: ");
		int num=sc.nextInt();
		
		//Mostramos el numero
		System.out.print("El número introducido es: "+num);
		
		
		// Cerramos scanner
		sc.close();
	}

}
