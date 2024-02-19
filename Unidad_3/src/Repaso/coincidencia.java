package Repaso;

public class coincidencia {



	final static int TAM=5;     //Longitud del array
	final static int LIM=25;    //Numeros generados entre 1 y N

	public static int compa(int[] arrayA, int[] arrayB) {
		int conta=0;
		
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayA[i]==arrayB[j]) {
					conta++;	
					
				}
			}
		}
		return conta;
	
	}
	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}


	public static void main(String[] args) {

		int arrayA[]=new int[TAM];
		int arrayB[]=new int[TAM];


		System.out.print("Array A:");
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i]=aleatorio(LIM);
			System.out.print(arrayA[i]+" ");

		}
		System.out.println();

		System.out.print("Array B:");
		for (int i = 0; i < arrayA.length; i++) {
			arrayB[i]=aleatorio(LIM);
			System.out.print(arrayB[i]+" ");

		}

		System.out.println();
		
		System.out.println("Coincidencias: "+compa(arrayA, arrayB));

	}
}


