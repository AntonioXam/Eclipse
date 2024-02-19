package boletin;

import java.util.Scanner;

public class menuboletin {
	final static int TAM=10;     //Longitud del array
	final static int LIM=100;    //Numeros generados entre 1 y N




	private static void menu() {
		System.out.println("\n----- MENU -----");
		System.out.println("1) Generar valores enteros de forma aleatoria ");
		System.out.println("2) Mostrar los valores generados en orden ascendente ");
		System.out.println("3) Mostrar el MAYOR valor generado ");
		System.out.println("4) Mostrar el MENOR valor generado ");
		System.out.println("5) Mostrar la MEDIA de los valores generado ");
		System.out.println("6) Salir ");
	}


	/**
	 * Funcion numeros aleatorios entre 1 y N	
	 * @param N numero entero positivo ,representa el limite superior del numero aleatorio
	 * @return devuelve un numero entero aleatorio entre 1 y N
	 */
	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}

	/**
	 * Funcion que imprime el array
	 * @param array parametro del array valores enteros
	 */
	public static void imprime(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

	/**
	 * Es una funcion que ordena el array por el metodo de la burbuja
	 * @param array valor del array
	 */
	public static void ordenar(int array[]) {
		int aux;
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}

			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		try {

			int Arreatorio[]=new int[TAM];

			for (int i = 0; i < Arreatorio.length; i++) {
				Arreatorio[i]=aleatorio(LIM);
			}

			int opcion;
			double media;
			media=Arreatorio[0];
			menu();
			do {
				
				System.out.print("\nElige una opción: ");
				opcion=sc.nextInt();

				switch (opcion) {
				
				case 1:	
					System.out.println("\n>> VALORES: ");
					imprime(Arreatorio); break;

				case 2:	
					ordenar(Arreatorio);
					System.out.println("\n>> VALORES: ");
					imprime(Arreatorio); break;
				case 3:
					ordenar(Arreatorio);
					System.out.println("\n>> MAYOR: "+Arreatorio[Arreatorio.length-1]);
					break;
				case 4:
					
					System.out.println("\n>> MENOR: "+Arreatorio[0]); break;
				case 5:

					// Mostramos los valores obtenidos
					media=media/TAM;
					System.out.println("\n>> MEDIA: "+media); break;
				case 6:
					System.out.println("\n>> Fin del programa. Bye!");break;
				default: System.out.println("\nNo es una opción válida.");break;

				}

			} while (opcion!=6);


		} catch (Exception e) {
			System.out.println("ERROR! comando no valido.");
		}
		sc.close();
	}

}
