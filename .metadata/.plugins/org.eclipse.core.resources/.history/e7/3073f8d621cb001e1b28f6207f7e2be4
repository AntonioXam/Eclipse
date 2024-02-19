package Boletines;

public class matriz2 {

	public static int aleatorio(int N) {
		return (int) (Math.random()*N+1);
	}
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=aleatorio(9);
			}
		
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) 
				System.out.print(matriz[i][j]+"\t");
				System.out.println();
		}
		
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
		System.out.print("Menor número: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]<menor) {
					menor=matriz[i][j];
				}
			} 
		}    System.out.println(menor);

	}
}

