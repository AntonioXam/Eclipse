package Repaso;



public class Rp3 {

	final static int TAM=10;     //Longitud del array
	final static int LIM=20;    //Numeros generados entre 1 y N

	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}


	public static void main(String[] args) {

		int array[]=new int[TAM];

		System.out.println("Generando numeros...");
		for (int i = 0; i < array.length; i++) {
			array[i]=aleatorio(LIM);
			System.out.print(array[i]);

			for (int j = 0; j < i; j++) {
				if (array[i]==array[j]) {
					System.out.print("---> repetido");
					break;
				}	
			}
			System.out.println();
		}
	}
}


