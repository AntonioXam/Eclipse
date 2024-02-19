package string2;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		//Constructores
		String nombre1="Pablo"; //Java permite crear objeto string asi 
		String nombre2=new String("Rigoberta"); //LAs dos formas son iguales
		
		//Otro constructor, creando objeto con clase scanner objeto sc 
		Scanner sc=new Scanner(System.in);
		System.out.print("dime tu nombre: ");
		
		//usamos el metodo trim() para eliminar espacios, no tenerlos en cuenta 
		String nombre3=sc.nextLine().trim(); 
		
		sc.close();
		
		System.out.println(nombre1+"-->Longitud: "+nombre1.length()); //probamos método length
		System.out.println(nombre2+"-->Longitud: "+nombre2.length());
		System.out.println(nombre3+"-->Longitud: "+nombre3.length());
		
		//metodo concat 
		System.out.println(nombre1.concat(" melachupa"));
		
		//metodo para mostrar en mayusculas 
		System.out.println(nombre1+"--> Mayusculas: "+nombre1.toUpperCase());
		System.out.println(nombre1+"--> Minusc: "+nombre1.toLowerCase());
		
		//metodo replace para remplazar
		System.out.println("Cambio letra-->"+nombre2.replace('g', 'G'));
		
		//metodo substring para eliminar letra de posicion seleccionada 
		System.out.println(nombre2.substring(1));
		
		
	}

}
