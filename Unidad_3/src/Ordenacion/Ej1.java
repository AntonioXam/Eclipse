package Ordenacion;

public class Ej1 {

	final static int TAM=50;
	final static int LIM=100;

	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}

	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

	public static void burbuja(int array[]) {
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


		try {


			int Arreatorio[]=new int[TAM];

			for (int i = 0; i < Arreatorio.length; i++) {
				Arreatorio[i]=aleatorio(LIM);
			}

			System.out.print("Array sin ordenar: ");
			imprimeArray(Arreatorio);


			burbuja(Arreatorio);
			System.out.print("\nArray ordenado: ");
			imprimeArray(Arreatorio);




		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}


	}

}
