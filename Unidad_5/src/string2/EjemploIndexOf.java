package string2;

import java.util.Scanner;

public class EjemploIndexOf {

	public static void main(String[] args) {
		//1.Pedimos usuario que introduzca cad. caracteres 
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce cadena caracteres: ");
		String cadena=sc.nextLine().trim(); //trim para que elimine espacios 
		
		
		//2.Pedimos que introduzca un carácter 
		System.out.print("Introduzce un carácter: ");
		char c=sc.nextLine().charAt(0);
		System.out.println("Caracter leido: "+c);
		
		
		//3.Indicamos si caracter esta en la cadena 
		
		/*
		 * si el resultado del indexOf da -1, no se encuentra ese carácter en cadena 
		 * Si lo encuentra, indica la posición en la que está,devuelve ese número 
		 */
		
		if(cadena.indexOf(c)==-1)  
			System.out.println("El carácter "+c+" no se encuentra en la cadena ");
		else 
			System.out.println("El carácter se encuentra en la cadena ");
		
		//4.Indicamos si subcadena se encuentra en cadena principal 
		System.out.print("\nDime otra cadena: ");
		String cadena2=sc.nextLine();
		
		if(cadena.indexOf(cadena2)==-1)
			System.out.println("La cadena "+cadena2+" no se encuentra en "+cadena);
		else 
			System.out.println("La cadena "+cadena2+" se encuentra en "+cadena);
		sc.close();
	}

}
