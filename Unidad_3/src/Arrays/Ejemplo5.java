package Arrays;

import java.util.Scanner;

public class Ejemplo5 {

	final static int TAM=5;
	/**
	 * FUnciones que muestra el mayor numero dentro de un Array
	 * @param array valores enteros
	 * @return el mayor numero dentro del array
	 */
	private static int mayor(int array[]) {
		int mayor=array[0];
		for (int i = 0; i < array.length; i++) 
			if (array[i]>mayor) {
				mayor=array[i];
		}
		return mayor;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     try {
			//Declaramos y creamos el array
	    	 int array[]=new int[TAM];
	    	 
	    	 //Pedimos al usuario que introduzca los valores
	    	 System.out.println("Introduce "+TAM+" valores de tipo entero: ");
	    	 for (int i = 0; i < array.length; i++) {
				System.out.print("Valor["+(i+1)+"]: ");
				array[i]=sc.nextInt();
			}
	    	 int mayor = array[0];
	    	 //Mostramos el mayor valor introducido
	    	 for (int i = 1; i < array.length; i++) {
				if (array[i]>mayor) {
					 mayor=array[i];
				}
			
			}
	    	 System.out.println();
	    	 System.out.println("El mayor número es: "+mayor);
	    	 
	    	System.out.println("El mayor número es: "+mayor(array));
	    	 
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	     
	     
	     sc.close();

	}

}
