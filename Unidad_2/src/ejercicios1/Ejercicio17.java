package ejercicios1;

public class Ejercicio17 {

	public static void main(String[] args) {

		for (int i=1; i<=4; i++) {
			// Imprimimos los espacios en blanco
			for (int j=4; j>i; j--) {
				System.out.print(" ");
			}

			// Imprimimos los asteriscos
			for (int k=i; k>=1; k--) {
				System.out.print("*");
			}
			// Imprimimos el salto de línea
			System.out.println("");
		}
	}
}