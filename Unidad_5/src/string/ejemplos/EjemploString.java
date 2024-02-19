package string.ejemplos;

import java.util.Scanner;

public class EjemploString {

	public static void main(String[] args) {
		//1.Pedimos usuario que introduzca su nombre 
		Scanner sc=new Scanner(System.in);
		System.out.print("Dime tu nombre: ");
		String nombre=sc.nextLine().trim(); //trim para que elimine espacios 
		sc.close();
		
		//2.Mostramos nombre por pantalla 
		System.out.println("Nombre: "+nombre);
		
		//3.Mostramos número de caracteres 
		System.out.println("Nº de carácteres: "+nombre.length());
		
		//4.Mostramos nombre en mayusculas 
		System.out.println("Nombre en mayúsculas: "+nombre.toUpperCase());
		
		//5.Mostramos nombre en minusculas 
		System.out.println("Nombre en minúsculas: "+nombre.toLowerCase());
		
		//6.Ejemplo replace, letra antigua por la ue queramos cambiar 
		System.out.println("Cambiamos e por X: "+nombre.replace('e', 'X'));
		
		//7.Ejemplo substring, muestra a partir de posición 
		System.out.println(nombre.substring(3));
		//Desde posicion hasta posicion 
		System.out.println(nombre.substring(2, 4));
		
		//8.Ejemplo startsWith() 
		if(nombre.startsWith("periko"))
			System.out.println("EL nombre empieza por periko ");
		else
			System.out.println("El nombre no empieza por periko");
		
		//9.endsWith()
		if(nombre.endsWith("maki"))
			System.out.println("Es el nombre del maki ");
		else 
			System.out.println("No termina por maki ");
		
		//10.Primer y último caracter 
		System.out.println("El nombre empieza por: "+nombre.charAt(0));//posicion 0 
		System.out.println("EL nombre acaba por: "+nombre.charAt(nombre.length()-1));
		
		//11.Mostrarlo con espacios 
		System.out.print("Espaciado: ");
		for(int i=0; i<nombre.length();i++)
			System.out.print(nombre.charAt(i)+" ");
		System.out.println();
		
		//12.Mostramos nombre al revés 
		System.out.print("Al revés: ");
		for(int i=nombre.length()-1; i>=0; i--)
			System.out.print(nombre.charAt(i));
		System.out.println();
		
		//13.Mostramos solo las vocales 
		System.out.print("Solo vocales: ");
		for(int i=0; i<nombre.length(); i++) {
			char c=nombre.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
				System.out.print(nombre.charAt(i));
		}
		//otra forma           //
		System.out.print("Solo vocales: ");
		for(int i=0; i<nombre.length(); i++) {
			char c=nombre.toLowerCase().charAt(i); //convertimos todas en minuscula 
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				System.out.print(nombre.charAt(i));
		}
		
		//Cuando usas un metodo con char, no se puede usar despues un metodo q sea para string 
		// por ej: nombre.charAt(0).toloweCase() NO FUNCIONA 
		//deberia ir antes para que te devuelva en minusc -->nombre.toLowerCase().charAt(0) 
		
		
		//
	}

}
