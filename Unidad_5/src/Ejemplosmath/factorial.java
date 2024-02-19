package Ejemplosmath;

public class factorial {
	
	public static long factorial2(int N) {
		
		int fact=1;
		while (N>0) {
			fact=fact*N;
			N--;
		}
		return fact;
		
	}

	public static long factorial(int N) {
		
		if(N==0)
			return 1;
		
		else
			return N*factorial(N-1);
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(factorial2(5));
		System.out.println(factorial(5));

	}

}
