package Arrays;

public class Ejemplo3 {

	public static void main(String[] args) {
		//Creamos un vector de 10 elementos de tipo entero
		int vector[]= {5,10,15,20,25,30,35,40,45,50};
		
		//Mostramos el vector
		System.out.print("Vector: ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		
		System.out.println();
		
		//Mostramos los valores almacenados en algunas posiciones
		System.out.println("Primero: "+vector[0]);
		System.out.println("Ultimo: "+vector[vector.length-1]);
		System.out.println("Segundo: "+vector[1]);
		System.out.println("Penultimo: "+vector[vector.length-2]);
		System.out.println("Tercero: "+vector[2]);
		System.out.println("Antepenultimo: "+vector[vector.length-3]);

	}

}
