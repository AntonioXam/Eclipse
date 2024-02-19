package ejercicios1;


import java.util.Scanner;

public class Boletin3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		try {
			do {
				System.out.print("Introduce un número: ");
				num = sc.nextInt();
				//Hacemos un bucle que pida el número repetidamente si no está entre 10 o 1	 
			} while (num>10 || num<1);

			//bucle para repetir desde 1 hasta el número pedido
			for (int i = 1; i <=num; i++) {

				// switch con cada número con su string 	
				switch (i) {
				
				case 1: System.out.print("UNO "); break;
				case 2: System.out.print("DOS "); break;
				case 3: System.out.print("TRES ");break;
				case 4: System.out.print("CUATRO "); break;
				case 5: System.out.print("CINCO ");break;
				case 6: System.out.print("SEIS "); break;
				case 7: System.out.print("SIETE ");break;
				case 8: System.out.print("OCHO "); break;
				case 9: System.out.print("NUEVE "); break;
				case 10: System.out.print("DIEZ "); break;

				}

			}

		} catch (Exception e) {
			System.out.println("Error!. Caracter no válido.");
		}

		sc.close();
	}

}
