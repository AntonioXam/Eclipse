package ejerciciosPoo;

public class cuadrado1 {
	public static int elemento (int fila, int columna) {
		// Caso base
		if (fila < 1 || columna< 1)
			return 0;
		if (fila == 1 || columna == 1)
			return 1;
		// Reducción de la complejidad
		return elemento(fila-1,columna)+elemento(fila,columna-1);
	}
	public static void main(String[] args) {
		int numfilas = 5;
		for (int i=1; i<(numfilas+1); i++) {
			for (int j=1; j<numfilas+1; j++) {
				System.out.print(elemento(i,j)+"\t");
			}
			System.out.println("");
		}
	}
}