package bucle;

public class contar1al10dowhile {
	public static void main(String[] args) {
		//Declaramos la variable contadora
		int conta;

		//Contar desde el 1 hasta 10
		conta=1;
		System.out.println("Contamos del 1 al 10:");
		do {
			System.out.println(conta+"  ");
			conta++;
		} while (conta<=10);
		
		conta=10;
		System.out.println("\nContamos del 10 al 1:");
		do {
			System.out.println(conta+"  ");
			conta--;
		} while (conta>=1);
		
	}

}
