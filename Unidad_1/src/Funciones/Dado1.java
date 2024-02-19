package Funciones;

public class Dado1 {
	/**
	 * Funcion que simula la tirada de un dado.
	 * @return   la tirada de un dado (valor 1 y 6)
	 */
	public static int dado()  {
		int res;
		res=(int)(Math.random()*6+1);
		return res;
		
	}
	//Programa principal
	public static void main(String[] args) {
		System.out.println("Vamos a tirar un dado 5 veces....\n");
		System.out.println("Primera tirada: "+dado());
		System.out.println("Segunda tirada: "+dado());
		System.out.println("Tercera tirada: "+dado());
		System.out.println("Cuarta tirada: "+dado());
		System.out.println("Quinta tirada: "+dado());
		

	}

}
