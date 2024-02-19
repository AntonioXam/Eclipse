package Ejercicios;

public class Ej11 {
	
	final static int FILAS=8;
	final static int COLUM=6;

	public static void matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				System.out.print(matriz[i][j]+"\t");
			System.out.println();

		}

	}
	public static void main(String[] args) {

		int matriz[][]=new int[FILAS][COLUM];
		System.out.println("Matriz  : ");
		matriz(matriz);

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUM; j++) {
				if (i==0 || j==0 || i==FILAS-1 || j==COLUM-1) {
					matriz[i][j]=1; 
				}
			}
		}
	
		System.out.println("Matriz cambiada  : ");
		matriz(matriz);
		
	}
}




