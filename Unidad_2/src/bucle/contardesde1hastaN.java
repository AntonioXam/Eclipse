package bucle;

public class contardesde1hastaN {

	/**
	 * Un numero aleatorio del 1 al N y de N al 1
	 * @param N un numero aleatorio
	 * @return devuelve un numero aleatorio
	 */
	
	public static int aleatorio(int N) {
		int res= (int)(Math.random()*N+1);
		return res;
		
		
	}
	public static void main(String[] args) {
		
		int j=aleatorio(10);
		
		for(int i=1; i<=j; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=10; i>=j; i--) {
			System.out.println(i);
		}
	}

}
