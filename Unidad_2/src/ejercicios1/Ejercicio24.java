package ejercicios1;

import java.util.Scanner;

public class Ejercicio24 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			int num;
			int pares = 0;
			int impares = 0;

			System.out.print("Introduce un número entero:  ");
			num=sc.nextInt();

			while(num!=0) {
				if (num%2==0) {
					pares++;
				} else {
					impares++;
				}
				System.out.print("Dime otro número: ");
				num=sc.nextInt();

			}
			System.out.println("Números pares introducidos: "+pares);
			System.out.println("Números impares introducidos: "+impares);

		


	} catch (Exception e) {
		System.out.println("Error. No es un valor valido");
	}





	sc.close();
}

}
