package bucle;

public class contar1a10while {

	public static void main(String[] args) {
		int conta;
		
		//contamos del 1 al 10
		conta=1;
		System.out.println("Contamos del 1 al 10");
		while(conta<=10) {
		System.out.print(conta+"  ");
		conta++;
		}
		System.out.println(""+"\n");
		//Contamos del 10 al 1
		int conta2;
		
		conta2=10;
		System.out.println("Contamos del 10 al 1");
		while(conta2>=1) {
			System.out.print(conta2+"   ");
			conta2--;
		}
	}

}
