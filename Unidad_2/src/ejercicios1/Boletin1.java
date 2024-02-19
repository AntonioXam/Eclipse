package ejercicios1;

import java.util.Scanner;

public class Boletin1 {
	/*
	 * Función que comprueba el mayor de 4 variables int distintias
	 * Condicianles para comparar cada número entre si.
	 */
	public static int mayor(int a,int b ,int c,int d) {
		if (a>b && a>c && a>d) {
			return a; }
		if (b>c && b>d) {
			return b;
			
		} if (c>d) {
			return c;
			
		} 
			return d;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     
		try {
			//Pedimos 4 numeros distintos por pantalla.
			  
			System.out.print("Introduce un numero: ");
			int num1 = sc.nextInt();
			System.out.print("Introduce un numero: ");
			int num2 = sc.nextInt();
			System.out.print("Introduce un numero: ");
			int num3 = sc.nextInt();
			System.out.print("Introduce un numero: ");
			int num4 = sc.nextInt();
			
			//Mostramos por pantalla el mayor de los 4 llamando a la función mayor.
			System.out.println("> Mayor número introducido: "+mayor(num1, num2, num3, num4));
			
			
		} catch (Exception e) {
			System.out.println("Error. Caracter no válido");
		}
		sc.close();
	}

}
