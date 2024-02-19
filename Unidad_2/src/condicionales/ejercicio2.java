package condicionales;

public class ejercicio2 {
	
	/**
	 * Funcion que genera un numero aleatorio
	 * @param N numero entero
	 * @return un numero aleatorio entre 1 y N (ambos incluidos)
	 */
	public static int aleatorio (int N) {
		return (int)(Math.random()*N+1);
	}
	public static boolean espar(int N) {
		if (N%2==0)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		// generamos un numero entre el 1 y 50
		int num= aleatorio(50);
		System.out.println("El número aleatorio es: "+ num);
		// 
		if (espar(num)==true)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");
			
		
	}
}