package pruebascasa;


public class mayordedos2funci {

	public static int mayor(int x, int y) {
		if (x>y)
			return x;
		else
			return y;
	}
		
	
	
	public static void main(String[] args) {
		int a=22;  
		int b=30;
		System.out.println(" Valores: "+a+ "  "+b);
		System.out.println(" Mayor: "+mayor(a,b));

	}

}