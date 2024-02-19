package string2;

import java.util.Scanner;

public class EjemploToCharArray {

	public static void main(String[] args) {
		//1.Pedimos usuario que introduzca cad. caracteres 
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce cadena caracteres: ");
		String cadena=sc.nextLine().trim(); //trim para que elimine espacios 
		sc.close();
			
		//2.Transformamos el String a un array de caracteres 
		char array[]=cadena.toCharArray();
		
		//3.Mostramos el primer caracter del String y el primer caracter del array 
		System.out.println("Primer caracter del String : "+cadena.charAt(0));
		System.out.println("Primer carácter del array: "+array[0]);
		
		//4.Ultimo caracter 
		System.out.println("Ultimo caracter del String : "+cadena.charAt(cadena.length()-1));
		System.out.println("Ultimo carácter del array: "+array[array.length-1]);
		
		//5.Mostramos por pantalla el String y el Array 
		System.out.println("\nString: "+cadena);
		System.out.print("\nArray: ");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]);
	}

}
