package condicionales;
public class ejercicio1 {
	
	/**
	 * Funcion que genera un numero aleatorio
	 * @param N numero entero
	 * @return un numero aleatorio entre 1 y N (ambos incluidos)
	 */
	public static int aleatorio (int N) {
		return (int)(Math.random()*N+1);
	}
	
	public static void main(String[] args) {
		// generamos un numero entre el 1 y 50
		int num= aleatorio(50);
		System.out.println("El número aleatorio es: "+ num);
		// 
		if (num %2 == 0)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");
			
	}
}