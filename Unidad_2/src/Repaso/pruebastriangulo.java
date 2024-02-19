package Repaso;



public class pruebastriangulo {

	public static void main(String[] args) {

		int altura=10;
		int i;
		int k;
		int j;


		for ( i = 1; i <=altura; i++) {

			for ( j = 1; j <=altura-i; j++) {
				System.out.print(" ");

			}

			for ( k = 1; k <=i*2-1; k++) {
				System.out.print("*");


			}

			System.out.println();
			
		}
		int tronco=2;
		
			for (i = 1; i <=tronco; i++) {
				for (k =1; k <=(altura-2); k++) {
					System.out.print(" ");
				}
					for (j = 1; j <=3; j++) {
					System.out.print("|");
					
				}
				System.out.println();
			}
	}
}



