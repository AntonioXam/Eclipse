package pruebascasa;


public class mayordedos {

	public static int mayor(int x, int y) {
		if (x>y)
			return x;
		else
			return y;
	}
	
		
		
	
	
	
	public static void main(String[] args) {
		int a=mayordedosesteparacopiar.aleatorio(2);
		int b=mayordedosesteparacopiar.aleatorio(22);
		System.out.println(" Valores: "+a+ "  "+b);
		System.out.println(" Mayor: "+mayor(a,b));

	}

}