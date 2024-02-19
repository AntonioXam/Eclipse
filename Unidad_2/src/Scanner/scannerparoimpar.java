package Scanner;

import java.util.Scanner;

public class scannerparoimpar {

	public static void main(String[] args) {
		// Creamos scanner
		Scanner teclado = new Scanner(System.in);
		 try {
			
		System.out.print("Introduce un número: ");
		int num=teclado.nextInt();
		
		if (num%2==0)
			System.out.println(num+" es par");
		else
			System.out.println(num+" es impar");
		
		 } catch (Exception e) {
				System.err.println("Error, no es un numero valido");


		teclado.close();
	}
	}
}
