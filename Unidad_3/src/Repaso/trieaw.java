package Repaso;

public class trieaw {

	public static void main(String[] args) {

		int altura=4;

		for (int i = 1; i <=altura; i++) {
			for (int j = altura; j >i; j--) {
				System.out.print(" ");
				
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(i);
				
			}
			System.out.println();
			
		}
		
		for (int i = altura-1; i >=1; i--) {
			for (int j = altura; j >i; j--) {
				System.out.print(" ");
				
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(i);
				
			}
			System.out.println();
			
		}
		
		}

	
	}