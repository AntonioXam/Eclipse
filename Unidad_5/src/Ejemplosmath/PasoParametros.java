package Ejemplosmath;

public class PasoParametros {
	
	public static void incrementa(int[] a) {
		a[0]++;
		
	}
	public static void main(String[] args) {
		
		int[] num= {5};
		
		incrementa(num);
		
		System.out.println(num[0]);
		
		

	}

}
