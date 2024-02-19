package Matrices;

public class Ej4 {

	final static int TAM=3;

	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}

	public static void matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				System.out.print(matriz[i][j]+"\t");
			System.out.println();
		}

	}
	public static void main(String[] args) {

		int matriz[][]=new int[TAM][TAM];



		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=aleatorio(25);
			}
		}

		System.out.println();

		System.out.println("Matriz : ");
		matriz(matriz);
	}

}
