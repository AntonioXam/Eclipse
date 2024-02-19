package Arrays;

public class Ejemplos4 {

	private static void imprimir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}
	public static void main(String[] args) {
		//Declaramos y creamos el array
		int[] vector= {1,2,3,4,5,6,7,8};

		//Visalizamos el array
		System.out.print("Vector: ");
		imprimir(vector);

		System.out.println();
		//Incrementamos los pares y decrementamos los impares
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]%2==0) {
				vector[i]++;

			} else {
				vector[i]--;}
		}
		System.out.println();
		imprimir(vector);


		for (int i = 0; i < vector.length; i++) {
			if (vector[i]%2==0) {
				vector[i]*=10;
			}
			
		}
		System.out.println();
		imprimir(vector);
	}
}
