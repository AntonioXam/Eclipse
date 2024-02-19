package ejercicios1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void pares(int a, int b) {
		for(int i=a; i<=b; i++)
			if (i%2==0)
				System.out.print(i+" ");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int primer;
			do {
				System.out.print("Introduce un numero entero positivo: ") ;
				primer = sc.nextInt();
			}     while (primer<=0);
			int segundo;
			do {	
				System.out.print("Introduce otro numero entero positivo: ");
				segundo = sc.nextInt();
			}         while (segundo<=0); 

			if (primer<segundo) 
				pares(primer, segundo);
			else
				pares(segundo, primer);


		}
		catch (Exception e) {
			System.out.println("No es entero positivo");

			sc.close();
		}

	}
}
