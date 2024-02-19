package Matrices;

public class Ej6 {

	final static int COLUM=4;
	final static int FIL=4;
	final static int ALE=5;

	public static int aleatorio() {
		return (int) (Math.random()*ALE+1);
	}

	public static void matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				System.out.print(matriz[i][j]+"\t");
			System.out.println();

		}

	}


	public static void main(String[] args) {

		int matriz[][]=new int[COLUM][FIL];



		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=aleatorio();
			}
		}

		System.out.println("Matriz  : ");
		matriz(matriz);

		//Mostramos la diagonal principal:

		System.out.print("\nLa diagonal principal: ");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i==j) {
					System.out.print(matriz[i][j]+" ");}
			}
		}
		
		System.out.print("\nLa diagonal principal otra forma: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i]+" ");
			
		}

	}
}




