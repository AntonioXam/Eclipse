package boletin;

import java.util.Scanner;

public class boletin2 {
	
	
	/**
	 * funcion con switch para mostrar los numeros del 1 al 10
	 * @param N el numero introducido lo convertimos a Letra
	 */
	public static void letras(int N) {
		switch(N) {
			case 1:System.out.println("> UNO");break;
			case 2:System.out.println("> DOS");break;
			case 3:System.out.println("> TRES");break;
			case 4:System.out.println("> CUATRO");break;
			case 5:System.out.println("> CINCO");break;
			case 6:System.out.println("> SEIS");break;
			case 7:System.out.println("> SIETE");break;
			case 8:System.out.println("> OCHO");break;
			case 9:System.out.println("> NUEVE");break;
			case 10:System.out.println("> DIEZ");break;
			
		
		}
	}
	
	/**
	 * Funcion primo
	 * @param N el numero del 1 al 10 hayamos su primo divisor entre 1 y si mismo
	 * @return devuelve un booleano true o false.
	 */
	
	public static boolean EsPrimo(int N) {
		for (int primo = 2; primo <=N/2; primo++) {
			if (N%primo==0) {
				return false;
			}
		}return true;
	}
	
	/**
	 * Funcion factorial 
	 * @param N numero del 1 al 10 su factorial multiplicando desde 1 hasta el número
	 * @return devuelve un LONG 
	 */
	public static long Factorial(int N) {
		long facto=1;
		for (int i = N; i >=1; i--) {
			facto*=i;
		}
		return facto;
	}
	
	/**
	 * Funcion Mayor divisor
	 * @param N número en 1 y 10 hallamos su maximo divisor
	 * @return devuelve su divisor.
	 */
	
	public static int MayorDivisor(int N) {
		int mdiv=1;
		for (int i = 2; i <=N/2; i++) {
			if (N%i==0) {
				mdiv=i;
			}
		}return mdiv;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int num;
			
			do {
				System.out.print("Introduce un número: ");
				num=sc.nextInt();
				//Comprobamos que el número esté entre 1 y 10 y avisamos con error
				if (num<1 || num>10) {
					System.out.println("Error: el número introducido no está entre 1 y 10.\n");
				}
			} while (num<1 || num>10);
						
			//Mostramos la funcion switch
			letras(num);
			
			//Mostramos la funcion primo
			if (EsPrimo(num)) {
				System.out.println("> "+num+" es primo.");
			}else {
				System.out.println("> "+num+" no es primo.");
			
			}
			// Mostramos funcion factorial
			System.out.println("> "+num+" ! = "+Factorial(num));
			//Mostramos funcion mayor divisor
			System.out.println("> Mayor divisor de "+num+" = "+MayorDivisor(num));
			
			
			
		
			
		} catch (Exception e) {
			System.out.println("Error: Caracter no válido.");
		}
		sc.close();
	}

}
