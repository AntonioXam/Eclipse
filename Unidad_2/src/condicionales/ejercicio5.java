package condicionales;

public class ejercicio5 {

	
	public static int aleatorio (int N) {
		return (int)(Math.random()*N+1);
	}
	public static void main(String[] args) {
		int num=aleatorio(20);
		
		//mostramos el numero por pantalla
		switch(num) {
		case 1:
		case 2: 
		case 3: 
		case 4: System.out.println("Menor que 5"); break;
		case 5: System.out.println("CINCO"); break;
		case 6: System.out.println("SEIS"); break;
		case 7: System.out.println("SIETE"); break;
		case 8: System.out.println("OCHO"); break;
		case 9: System.out.println("NUEVE"); break;
		case 10: System.out.println("DIEZ"); break;
		default: System.out.println(" El número es mayor que el DIEZ: " +num);
		}

	}

}
