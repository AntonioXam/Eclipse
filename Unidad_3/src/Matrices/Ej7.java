package Matrices;

public class Ej7 {



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

	public static void matrizPar(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				if (matriz[i][j]%2==0) {
					System.out.print(matriz[i][j]+"\t");
				}
				else { 
					System.out.print("*\t");
				}
			System.out.println();}

	}

	public static void matrizImpar(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				if (matriz[i][j]%2==1) {
					System.out.print(matriz[i][j]+"\t");
				} else { 
					System.out.print("*\t");
				}
			System.out.println();
		}

	}
	public static void main(String[] args) {

		int[][] matriz=new int[3][4];



		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=aleatorio(20);
			}
		}

		System.out.println("Matriz  : ");
		matriz(matriz);

		System.out.println("\nMatriz pares : ");
		matrizPar(matriz);

		System.out.println("\nMatriz impares : ");
		matrizImpar(matriz);

		int mayor=matriz[0][0];

		System.out.print("\nMayor número: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]>mayor) {
					mayor=matriz[i][j];
				}
			} 
		}    System.out.println(mayor);

		int menor=matriz[0][0];
		System.out.print("\nMenor número: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]<menor) {
					menor=matriz[i][j];
				}
			} 
		}    System.out.println(menor);

	}
}




