package pruebascasa;


public class buclersin {

	
	public static int aleatorio(int N) {
		return (int)(Math.random()*N+1);
		
		
	}
	public static void main(String[] args) {
		int num;
		num=aleatorio(20);
		
		
		while(num<=19) {
		
		num=aleatorio(20);
		System.out.println(num);
		
			
			
		}
		
	}
	
}




