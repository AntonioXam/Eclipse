package bucle;



public class contar1a10for {

	public static int aletatorio(int N) {
		return (int)(Math.random()*N+1);
	}
	public static void main(String[] args) {
		// contamos del 1 al 10 con bucle for
		System.out.println("Contamos del 1 al 10: ");
		for(int conta=1; conta<=10; conta++)
			System.out.println(conta+" ");

		//contamos del 10 al 1 bucle for
		System.out.println("\nContamos del 10 al 1; ");
		for(int conta=10; conta>=1; conta--)
			System.out.println(conta);

		//contamos del 1 al "N" aleatorio
		int N= aletatorio(25);
		int conta=1;
		System.out.println("\nContamos del 1 a un número aleatorio: ");
		for( conta=1; conta<=N; conta++ )
			System.out.println(conta);
	}

}
