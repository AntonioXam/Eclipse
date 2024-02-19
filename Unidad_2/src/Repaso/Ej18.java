package Repaso;



public class Ej18 {

	public static void main(String[] args) {
		int altura=10;
		for (int lineas = 1; lineas <=altura; lineas++) {
			for (int espacios = 1; espacios <=altura-lineas; espacios++) {
				System.out.print(" "); }
			for (int asteriscos = 1; asteriscos <=2*lineas-1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();}


		for (int i = 1; i <=2; i++) {
			for (int espacios =1; espacios<=altura-2;espacios++ ) {
				System.out.print(" "); }
			for (int k =1; k<=3; k++) {
				System.out.print("|");

			}
			System.out.println();
		}

	}
}





