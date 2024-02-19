package string;

import java.util.Scanner;

public class Ejemplos1 {

	public static void main(String[] args) {
		
		// Primer string
		String nombre1="Pablo";
		
		//segundo string
		String nombre2= new String("Rigoberta");
		
		System.out.print("Dime tu nombre: ");
		//tercer string por teclado
		Scanner sc=new Scanner(System.in);
		String nombre3=sc.nextLine().trim();// .trim() elimina los espacios al principio y al final
		
		System.out.println(nombre1+" --> Longitud: "+nombre1.length());
		System.out.println(nombre2+" --> Longitud: "+nombre2.length());
		System.out.println(nombre3.trim()+" --> Longitud: "+nombre3.length());
							//trim elimina espacios//
		System.out.println(nombre1.concat(" "+nombre2));
		
		System.out.println(nombre1+" --> Mayusculas: "+nombre1.toUpperCase());
		System.out.println(nombre1+" --> Minusculas: "+nombre1.toLowerCase());
		
		System.out.println(nombre2.replace('g','G'));
		System.out.println(nombre2.substring(1));
		sc.close();
	}

}
