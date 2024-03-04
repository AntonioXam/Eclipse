package Ejercicios;

import java.util.Scanner;

public class ConversorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.print("Introduce un número: ");
			int num=Integer.parseInt(sc.nextLine());
			System.out.println("B -- Binario \nO -- Octal \nH -- Hexadecimal");
			System.out.print("Introduce el tipo conversion:");
			String letra=sc.nextLine();
			
			Conversor c=new Conversor(num);
			System.out.println(c.getNumero(letra));
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	}
	

}
