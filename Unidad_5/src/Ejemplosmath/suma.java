package Ejemplosmath;

public class suma {

	
	public static int suma(int N) {
		
		if(N==0)
			return 0;
		else
			return N+suma(N-1);
	
		
	}
	
	public static int sumaDig(int N) {
		int num=Math.abs(N);
		
		//caso base
		if (num<10) 
			return num;
		else     //recursividad
			return (num%10)+sumaDig(num/10);
	
		
		
	}
	public static void main(String[] args) {
		
		
		
		System.out.println(sumaDig(5));
		System.out.println(sumaDig(123));
		

	}

}
