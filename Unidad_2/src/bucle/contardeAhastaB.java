package bucle;

public class contardeAhastaB {

	public static int aleatorio(int N) {
		int res=(int)(Math.random()*N+1);
		return res;
	}
	public static void main(String[] args) {
		
		int a=aleatorio(25);
		int j=aleatorio(25);
	
		while(a<j)
			if (a<=j) {
				System.out.println(a);
				a++;
			}	
			else{
				while (a>=j) {
				System.out.println(a);
				a--;
				}
				
			
			}
			
			
	}
	
	
		

	}


