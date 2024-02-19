import java.util.Scanner;

public class arrraydeString {

	
	
	private final static int TOTAL=5;
	
	
	public static void imprime(String array[]) {
		for (int i = 0; i < TOTAL; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	
	/**
	 * Funcion que devuelve el indice del string mas largo almaceanado en un array de nombres
	 * @param array de strings
	 * @return el nombre mas largo en numero entero
	 */
	public static int mayorNombre(String[] array) {
		int may=0;
		for (int i=1; i<array.length; i++) {
			if (array[may].length()<array[i].length())
				may=i;

		}
		return may;
	}
	
	public static int menorNombre(String[] array) {
		int min=0;
		for (int i=1; i<array.length; i++) {
			if (array[min].length()>array[i].length())
				min=i;

		}
		return min;
	}
	
	/**
	 * Funcion que ordena nombre alfabeticamente
	 * @param array
	 */
	public static void burbujaNombres(String array[]) {
		String aux;
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (array[j].compareTo(array[j+1])>0) {
					aux=array[j+1];
					array[j+1]=array[j];
					array[j]=aux;

				}

			}

		}
	}
	public static void main(String[] args) {
		// Creamos el vector que almacenará los números leídos por teclado
				String[] vector = new String[TOTAL];
				// Leemos los números introducidos por teclado y los almacenamos en vector
				Scanner sc = new Scanner(System.in);
				
				try {
					for (int i=0; i<TOTAL; i++) {
						System.out.print("["+(i+1)+"] Introduce un nombre: ");
						vector[i]=sc.nextLine();
					}
					
					
					
				System.out.print("\nNombres introducidos: ");
				imprime(vector);
				System.out.print("\nNombre de mayor tamaño: "+vector[mayorNombre(vector)]);
				System.out.print("\nNombre de menor tamaño: "+vector[menorNombre(vector)]);
				System.out.print("\nNombre ordenados alfabeticamente: ");
				burbujaNombres(vector);
				imprime(vector);
				System.out.print("\nNombre aleatorio: "+vector[(int)Math.random()*TOTAL]);
				
				} catch (Exception e) {

					System.out.println("Error en la introducción de datos");

				}
				sc.close();
				
				
				
			
			}
		}