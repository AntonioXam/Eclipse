package Ejercicios;

public class Ej12 {
	
	final static int COLUM=5;
	final static int FIL=5;
	

	public static void matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				System.out.print(matriz[i][j]+"\t");
			System.out.println();

		}

	}


	public static void main(String[] args) {

		int matriz[][]=new int[COLUM][FIL];
		System.out.println("Matriz  : ");
		matriz(matriz);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i==j) {
					matriz[i][j]++;	}
				}
		}
		
		//otra forma
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][i]=1;
		}
		System.out.println("Matriz cambiada  : ");
		matriz(matriz);
		
		

	}
}




