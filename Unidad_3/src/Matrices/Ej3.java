package Matrices;

public class Ej3 {

	 final static int TAM=3;
	 
	 public static void matriz(int matriz[][]) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) 
					System.out.print(matriz[i][j]+"\t");
				System.out.println();
			}
			
		}
	public static void main(String[] args) {
		
		int matriz[][]=new int[TAM][TAM];
		
		System.out.println("Matriz inicial: ");
		matriz(matriz);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]++;
			}
		}
		
		System.out.println();
		
		System.out.println("Matriz cambiada 1: ");
		matriz(matriz);
	}

}
