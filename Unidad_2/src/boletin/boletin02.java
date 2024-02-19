package boletin;



public class boletin02 {

	public static void main(String[] args) {
	
	
		int filas = 4;
		
		for(int i=1; i<=filas; i++) {
			for(int m=filas; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		for(int i=filas-1; i>=1; i--) {
			for(int m=filas; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");

			}
			System.out.println(); }
	}
	
}