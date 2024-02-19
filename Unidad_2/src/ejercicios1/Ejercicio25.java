package ejercicios1;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int num=Integer.MIN_VALUE;
			int numActual;
			int error=0;
			
			
			do {
				System.out.print("Dame un numero: ");
				
				numActual=sc.nextInt();
				
				
				if (numActual>num) {
					num=numActual;
				}
				else {
					System.out.println("Error. Es menor o igual que el anterior.");
					error++; }

			} while(numActual!=0);
				
			
				System.out.println("Numero de errores: "+error);
				System.out.println("FIN");

		} catch (Exception e) {
			System.out.println("Error!!!");
			sc.close();

		}
	}
}
