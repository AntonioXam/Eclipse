package bucle;

public class multiplicar {

	public static void tabla(int num) {
		for (int conta=1; conta<=10 ;conta++) {
			System.out.println(num+" x "+conta+ " = "+(num*conta));
		}
	}

	public static void main(String[] args) {

		for (int conta=1; conta<=10 ;conta++) {
			tabla(conta);
			System.out.println();
		}


	}


}


