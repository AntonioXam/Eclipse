package ejercicios1;

import java.util.Scanner;

public class Ejercicio31 {

	/**
	 * Función que devuelve el mayor divisor (distinto del propio número) de un no entero
	 * @param número entero
	 * @return un número entero positivo (el mayor divisor)
	 */
	static int mayordivisor(int N) {
		int num=Math.abs(N); // Tomamos el valor absoluto para trabajar con números positivos
		int div=1;
		for (int i=2; i<=num/2; i++)
			if (num%i==0)
				div=i;
		return div;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
	     int num = sc.nextInt();
	     
	     System.out.print("El mayor divisor de "+num+" es "+mayordivisor(num));
	     sc.close();

	}

}
