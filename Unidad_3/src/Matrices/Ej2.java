package Matrices;

public class Ej2 {

	
	public static void matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				System.out.print(matriz[i][j]+"\t");
			System.out.println();
		}
		
	}
	public static void main(String[] args) {


		int[][] matriz1= {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
		int[][] matriz2= {{1,2,3,4}, {6,7,8,9}, {11,12,13,14}};

		
		
		System.out.println("Matriz 1: ");
		matriz(matriz1);

		System.out.println();
		
		
		System.out.println("Matriz 2: ");
		matriz(matriz2);
		}

	}
